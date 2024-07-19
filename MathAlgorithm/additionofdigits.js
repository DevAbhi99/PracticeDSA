let add=(n)=>{
let sum=0;
    while(n!=0){
        let rem=n%10;
       sum+=rem;
        n=Math.floor(n/10);
    }

    return sum;
}

let n=1234;

console.log(add(n));