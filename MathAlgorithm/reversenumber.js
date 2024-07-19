let n=12345;



let origin=n;

let rev=0;

while(origin!=0){

let rem=origin%10;
rev=rev*10+rem;
origin=Math.floor(origin/10);

}

console.log(rev);