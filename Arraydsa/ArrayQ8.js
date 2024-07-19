//Find all repeating elements in an array


let repeat=(arr)=>{


let s=new Set();

    for(let i=0;i<arr.length;i++){
        let count=0;
        for(let j=0;j<arr.length;j++){
           if(arr[i]===arr[j]){
            count++;
           }
          
          }

          if(count>1){
             s.add(arr[i]);
          }
    }

  let res=[];

  for(let i of s){
    res.push(i);
  }

  res.sort((a,b)=>a-b);

return res;
     
     }
     
     let arr= [1,1,0];
     
     
     console.log(repeat(arr));