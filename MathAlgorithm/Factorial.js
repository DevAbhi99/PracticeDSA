let factorial=(n)=>{

let prod=1;

for(let i=n;i>=2;i--){ 
    prod*=i;
}

return prod;

}

let n=5;

console.log(factorial(n));