//counting frequency

let frequency=(s)=>{


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


    let arr=Array.from(hm);

    arr.sort((a,b)=>a[0].localeCompare(b[0])); //sorting on the basis of key

    let res=[];

for(let [key,value] of arr){
    res.push(key+''+value);
}

return res;
  }








  
  let s='takeuforward';
  
  console.log(frequency(s));