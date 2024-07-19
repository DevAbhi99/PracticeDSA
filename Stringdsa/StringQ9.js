//Maximum occurring character in a string



let max=(s)=>{

let hm=new Map();

    for(let i=0;i<s.length;i++){
        let count=0;
        for(let j=0;j<s.length;j++){
          if(s.charAt(i)===s.charAt(j)){
            count++;
          }
        }
        hm.set(s.charAt(i),count);
    }


    let max=0;

    for( let [key, value] of hm.entries()){
          if(value>max){
            max=value;

          }

    }

    for( let [key, value] of hm.entries()){
        if(value==max){
          return key;

        }

  }


   
  
  
  }



  
  let s='take u forward';
  
  console.log(max(s));
