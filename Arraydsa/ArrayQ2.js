//Given an array, we have found the number of occurrences of each element in the array.


let occurence=(arr)=>{

   let s=new Set(arr);

   let temp=[];

   for(let i of s){
      temp.push(i);
   }

   let map=new Map();

   for(let i=0;i<temp.length;i++){
      let count=0;
      for(let j=0;j<arr.length;j++){
         if(temp[i]==arr[j]){
            count++;
         }
      }
      map.set(temp[i],count);
   }
    

return map;



    }
    
    let arr= [2,2,3,4,4,2];
    
    
    console.log(occurence(arr));