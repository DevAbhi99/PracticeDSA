//Remove vowels from the string

let removeVowels=(s)=>{

    let arr=[];


for(let i=0;i<s.length;i++){
    if(s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U'&&s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
        {
     
      arr.push(s.charAt(i));

    }
}

let sum='';

for(let i=0;i<arr.length;i++){
  sum+=arr[i];
}

return sum;

  
  
  }



  
  let s='take u forward';
  
  console.log(removeVowels(s));