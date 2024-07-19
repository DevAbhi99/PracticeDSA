//Find all non-repeating elements in an array


let repeat=(arr)=>{


    let s=new Set();
    
        for(let i=0;i<arr.length;i++){
            let count=0;
            for(let j=0;j<arr.length;j++){
               if(arr[i]===arr[j]){
                count++;
               }
              
              }
    
              if(count==1){
                 s.add(arr[i]);
              }
        }
    
      let res=[];
    
      for(let i of s){
        res.push(i);
      }
    
    return res;
         
         }
         
         let arr= [1,2,3];
         
         
         console.log(repeat(arr));