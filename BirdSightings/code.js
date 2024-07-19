let occurence=(arr)=>{

let hm=new Map();

for(let i of arr){
    if(hm.has(i)){
        hm.set(i,hm.get(i)+1);
    }
    else{
        hm.set(i,1);
    }
}


let maxcount=0;

let min=Infinity;

for(let [k,v] of hm.entries()){
  if(v>maxcount||v===maxcount&&min<k){
    maxcount=v;
    min=k;
  }

}

return min;

}


let arr=[1,2,3,2,4,4,4,5];


console.log(occurence(arr));