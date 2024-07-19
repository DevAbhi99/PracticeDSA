let sort=(arr)=>{

if(arr.length<1){
    return arr;
}

    let pivot=arr[arr.length-1];

    let leftArr=[];

    let rightArr=[];

    for(let i=0;i<arr.length-1;i++){
      if(arr[i]<pivot){
         leftArr.push(arr[i]);
      }
      else{
        rightArr.push(arr[i]);
      }
    }

    return [...sort(leftArr).concat(pivot).concat(...sort(rightArr))];


}


let arr=[5,4,3,2,1];

console.log(sort(arr));