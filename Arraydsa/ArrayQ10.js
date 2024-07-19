//Maximum Product Subarray in an Array

let maxProd=(arr)=>{

  arr.sort((a,b)=>a-b);

  let positiveArray=[];
  
  let negativeArray=[];
  
  let pProd=1;

  let nProd=1;

  for(let i=0;i<arr.length;i++){
    if(arr[i]<0){  
    negativeArray.push(arr[i]);
    }
    else if(arr[i]>0){
       positiveArray.push(arr[i]);
    }
  }

  if(negativeArray.length%2!=0){
       for(let i=0;i<negativeArray.length-1;i++){
        nProd*=negativeArray[i];
       }
  }
  else if(negativeArray.length%2===0){
    for(let i=0;i<negativeArray.length;i++){
        nProd*=negativeArray[i];
       } 
  }

  for(let i=0;i<positiveArray.length;i++){
    pProd*=positiveArray[i];
  }


  return nProd*pProd;


 }
     
     let arr= [1,2,3,4,5,0];
     
     
     console.log(maxProd(arr));