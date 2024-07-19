//Given two strings, check if two strings are anagrams of each other or not.

let anagram=(s1,s2)=>{


if(s1.length!=s2.length){
    return false;
}
else{

let arr1=[];
let arr2=[];

for(let i=0;i<s1.length;i++){
    arr1.push(s1.charAt(i));
    arr2.push(s2.charAt(i));
}

arr1.sort();
arr2.sort((a,b)=>a-b);

return JSON.stringify(arr1) == JSON.stringify(arr2);



}


      }
    
      let s1='RULES';
      let s2='LESRT';

      console.log(anagram(s1,s2));