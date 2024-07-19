let prod=1;

let factorial=(n)=>{

prod*=n;

n=n-1;

if(n==1){
    console.log(prod);
}

if(n>1){
    factorial(n);
}

}

let n=5;

factorial(n);