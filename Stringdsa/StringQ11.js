//Print character



let printduplicate=(s)=>{

    let arr=[];
    
let hm=new Map();

for(let i=0;i<s.length;i++){

    let count=0;

    for(let j=0;j<s.length;j++){
      if(s.charAt(i)===s.charAt(j)){
        count++;
      }

    }
    if(count>1){
        hm.set(s.charAt(i),count);
    }

}

let arrayMap=Array.from(hm);

arrayMap.sort((a,b)=>b[1]-a[1]);

return arrayMap;

    
    }
    
    let s='abcdefg';
    
    console.log(printduplicate(s));