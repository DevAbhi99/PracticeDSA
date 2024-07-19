//Finding Equilibrium index in an array


let equilibrium=(arr)=>{

 



 for(let i=0;i<arr.length;i++){

    
    let sum=0;
    let sum2=0;

    if(i==0){
        
        for(let j=i+1;j<arr.length;j++){           //for first index
            sum+=arr[j];
        }
        if(sum==0){
            return i;
        }
    }
    else if(i==arr.length-1){
    
        for(let j=i-1;j>=0;j--){                     //for last index
            sum+=arr[j];
        }
        if(sum==0){
            return i;
        }
    
    }
    else if(i>0&&i<arr.length-1){
    
        for(let j=0;j<i;j++){     //for anywhere in the middle index
            sum+=arr[j];
        }
        for(let k=arr.length-1;k>i;k--){
            sum2+=arr[k];
        }
        if(sum==sum2){
            return i;
        }
                                                        
    }
   
 }
    
   
     
     }
     
     
     let arr= [1,-1,4];
     
     
     console.log(equilibrium(arr));