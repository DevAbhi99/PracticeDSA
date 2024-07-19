//Given an array of integers, having some duplicate elements, sort the array by frequency.


let arraySort=(arr)=>{

let hm=new Map();

for(let i=0;i<arr.length;i++){
     let count=0;
    for(let j=0;j<arr.length;j++){
      if(arr[i]==arr[j]){
        count++;
      }
   }
   hm.set(arr[i],count);
}


let arrayMap=Array.from(hm); //convert map to array 

arrayMap.sort((a,b)=>
  {
    if(b[1]!=a[1]){
        return b[1]-a[1];  //descending order 
    }else{
        return a[0]-b[0];  //ascending order
    }
}
  ); 


let res=[];

for(let [key, value] of arrayMap){

    for(let i=0;i<value;i++){
        res.push(key);
    }
}


return res;


     
     }
     
     let array=[-199,6,7,-199,3,5];
     
     
     console.log(arraySort(array));