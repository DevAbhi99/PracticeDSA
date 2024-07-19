let sort=(arr)=>{

if(arr.length<2){
    return arr;
}

let mid=Math.floor(arr.length/2);

let leftArr=arr.slice(0,mid);
let rightArr=arr.slice(mid);

return merge(sort(leftArr),sort(rightArr));
}

let merge=(leftArr,rightArr)=>{

    let sortArr=[];

    while(leftArr.length&&rightArr.length){
        if(leftArr[0]<=rightArr[0]){
            sortArr.push(leftArr.shift());
        }
        else{
            sortArr.push(rightArr.shift());
        }
    }

    return [...sortArr,...leftArr,...rightArr];

}


let arr=[5,4,3,2,1];

console.log(sort(arr));