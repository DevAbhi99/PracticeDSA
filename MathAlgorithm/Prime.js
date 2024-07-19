let prime=(n)=>{

if(n>3)
{
   if((n%2==0)||(n%3==0)||(n%Math.sqrt(n)==0)){
    return `${n} is Composite`;
     }
    else{
    return `${n} is prime`;
     }
}
else if(n==1){
    return `${n} is neither prime nor composite`; 
}
else{
    return `${n} is prime`;
}

}

let n=5;

console.log(prime(n));