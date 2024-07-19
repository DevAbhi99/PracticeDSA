//Remove spaces from the string

let removeSpaces=(s)=>{

    let st=s.trim();

    let arr=st.split(' ');

let sum='';

    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    return sum;

  
  
  }



  
  let s='take u forward';
  
  console.log(removeSpaces(s));