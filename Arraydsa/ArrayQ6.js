//Rotate array by K elements : Block Swap Algorithm


let swap=(arr,k)=>{

    let ar1=arr.slice(k);

    let ar2=arr.slice(0,k);

    return ar1.concat(ar2);
  

     
     }
     
     let arr= [1,2,3,4,5,6,7];
     
     let k=3;
     
     console.log(swap(arr,k));