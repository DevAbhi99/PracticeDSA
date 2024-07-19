//Given a string, print non-repeating characters of the string.

let nonRepeat=(s)=>{

let res=[];

    for(let i=0;i<s.length;i++){
        let count=0;
        for(let j=0;j<s.length;j++){
          if(s.charAt(i)===s.charAt(j)){
              count++;
          }
        }
        if(count==1){
            res.push(s.charAt(i));
        }
    }

return res;

  }

  let s='yahoo';
  
  console.log(nonRepeat(s));