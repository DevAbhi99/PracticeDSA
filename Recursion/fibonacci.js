let i=2;

let fib=[0,1];

let fibonacci=(n)=>{




fib[i]=fib[i-1]+fib[i-2];

if(i==n-1){
console.log(fib);
}

i=i+1;

if(i<=n){
    
    fibonacci(n);
}

}



let n=8;

fibonacci(n);