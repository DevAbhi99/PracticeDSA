//Second Smallest and Second Largest element in an array


let find=(arr)=>{

let s=new Set(arr);

let res=[];

for(let i of s){ 
    res.push(i);
}

res.sort((a,b)=>a-b);

return 'Second smallest element is '+res[1]+'\n'+'Second largest element is '+res[res.length-2];

}

let arr= [1,2,4,7,7,5];


console.log(find(arr));