let search=(arr,target)=>{

let i=0;
let j=arr.length-1;


while(i<=j){
    let middle=Math.floor((i+j)/2);

    if(arr[middle]===target){
        return true;
    }
    else if(arr[middle]>target){
        j=middle-1;
    }
    else{
        i=middle+1;
    }
}
return false;
}


let arr=[1,2,3,4,5];

let target=4;


console.log(search(arr,target));