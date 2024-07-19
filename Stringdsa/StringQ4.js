//Remove special characters from the string

let removeSpecialChar=(s)=>{

    let arr=[];

    for(let i=0;i<s.length;i++){

        if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
            arr.push(s.charAt(i));
        }
    }
  
    let sum='';

    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }

  return sum;
  
  }



  
  let s='1.Python & 2.Java';
  
  console.log(removeSpecialChar(s));