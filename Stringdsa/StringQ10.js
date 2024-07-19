//Remove duplicate values from a string



let duplicate=(s)=>{

let arr=[];

for(let i=0;i<s.length;i++){
    arr.push(s.charAt(i));
}

let set=new Set(arr);

let arrmap=Array.from(set);

let sum='';

for(let i of arrmap){
  sum+=i;
}

return sum;

}

let s='cbacdcbc';

console.log(duplicate(s));