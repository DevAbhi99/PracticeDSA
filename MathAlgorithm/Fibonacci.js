
//Algorithm1

let fibonacci=(n)=>{

let n1=0;
let n2=1;

let arr=[0,1];


for(let i=0;i<n-2;i++){

let sum=n1+n2;

arr.push(sum);

n1=n2;

n2=sum;


}

return arr;
}

let n=8;

console.log(fibonacci(n));

/*
//Algorithm2

let fibonacci=()=>{

let fib=[0,1];

for(let i=2;i<n;i++){

    fib[i]=fib[i-1]+fib[i-2];
}

return fib;
}

let n=8;

console.log(fibonacci(n));*/