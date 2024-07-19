//Write a program to find whether an array is a subset of another array or not.


let subset=(arr1,arr2)=>{

    let count=0;

    for(let i=0;i<arr1.length;i++){
        for(let j=0;j<arr2.length;j++){
            if(arr1[i]===arr2[j]){
                count++;
            }
        }
    }

    if(count==arr1.length){
        return 'array1 is a subset of array2';
    }
    else{
        return 'array1 is not a subset of array2';
    }


   
     }
     
      let arr1= [1,3,4,5,2]
       let arr2= [4,5,2]
     
     
     console.log(subset(arr1,arr2));