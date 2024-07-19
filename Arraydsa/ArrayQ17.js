//Rotate thearray k times

//for ex: nums=[1,2,3,4,5,6,7] and k=3 then nums=[5,6,7,1,2,3,4];


//solve


let rotate=(nums,k)=>{

let n=nums.length;

k=k%n;

function reverse(i,j){
    while(i<j){
        let temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
}

reverse(0,n-1);

reverse(o,k-1);

reverse(k,n-1);

}

let nums=[1,2,3,4,5,6,7];

let k=3;

console.log(rotate(nums,k));