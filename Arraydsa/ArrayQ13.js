//Given an array of integers, rotating array of elements by k elements either left or right.


let rotate=(arr,k)=>{

    for(let i=1;i<=k;i++){

       arr.unshift(arr[arr.length-1]);

      arr.pop();


    }
 
    return arr;
    
     
     }
     
     let arr= [3,7,8,9,10,11];
     
     let k=3;
     
     console.log(rotate(arr,k));