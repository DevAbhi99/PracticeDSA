let sort=(arr)=>{

for(let i=0;i<arr.length-1;i++){
       let temp=0;
    for(let j=0;j<arr.length;j++){
       if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
       }
    }
}

return arr;
}



let arr=[5,4,3,2,1];

console.log(sort(arr));