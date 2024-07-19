//Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order


let ascdesc=(arr)=>{

    let n=Math.floor(arr.length/2);

    arr.sort((a,b)=>a-b);

    let ar1=arr.slice(0,n);
    
     ar1.sort((a,b)=>a-b);

    let ar2=arr.slice(n);

    ar2.sort((a,b)=>a-b);

    ar2.reverse();

    return ar1.concat(ar2);
     
     }
     
     let arr= [4, 2, 8, 6, 15, 5, 9, 20];
     
     
     console.log(ascdesc(arr));