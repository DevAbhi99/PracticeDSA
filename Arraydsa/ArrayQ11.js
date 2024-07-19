//Replace elements by its rank in the array


let replace=(arr)=>{



let s=new Set(arr);

let temp=[];

for(let i of s){
    temp.push(i);
}

temp.sort((a,b)=>a-b);

  for(let i=0;i<arr.length;i++){

    let index=temp.indexOf(arr[i]);

    arr[i]=index+1;
  }


  return arr;


     }
     
     let arr= [1, 5, 8, 15, 8, 25, 9];
     
     
     console.log(replace(arr));