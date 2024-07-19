/*  
print something like this for n-integer value

   #
  ##
 ###
####
*/ 


let staircase=(n)=>{

for(let i=0;i<n;i++){
    for(let j=1;j<=n-1;j++){
        if((i+j)<n){
            process.stdout.write(' ');
        }
        else{
            process.stdout.write('#');
        }
    }
    process.stdout.write('\n');
}

}


let n=4;

console.log(staircase(n));