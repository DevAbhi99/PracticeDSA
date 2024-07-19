//Remove Brackets from the string

let removeBrackets=(s)=>{

    let arr=[];

    for(let i=0;i<s.length;i++){

        if(s.charAt(i)!='('&&s.charAt(i)!=')'){
            arr.push(s.charAt(i));
        }
    }
  
    let sum='';

    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }

  return sum;
  
  }



  
  let s='a+((b-c)+d)';
  
  console.log(removeBrackets(s));