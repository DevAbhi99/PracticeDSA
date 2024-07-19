// Find the missing smallest positive integer in the array


let positive=(arr)=>{

arr.sort((a,b)=>a-b);

arr=arr.filter(item=>item>=0);


let n=arr[0];

let count=0;

while(n<=arr[arr.length-1]){
    
    if(!arr.includes(n)){
       n=n;
       break;
    }
    
    n+=1;
}

return n;



}


let arr=[3,4,-1,1];

console.log(positive(arr));