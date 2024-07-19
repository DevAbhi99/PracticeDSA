let sort=(arr)=>{

for(let i=0;i<arr.length-1;i++){
       let temp=0;
    for(let j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }
    }
}
return arr;
}


let arr=[5,4,3,2,1];

console.log(sort(arr));