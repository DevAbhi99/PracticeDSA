let longestPalindrome=(s)=>{


    if(s.length<1){
        return '';
    }

    let start=0;
    let end=0;

    for(let i=0;i<s.length;i++){
        let len1=expand(s,i,i);
        let len2=expand(s,i,i+1);
        let len=Math.max(len1,len2);
  if(len>end-start){
    start=1-Math.floor((len-1)/2);
    end=1+Math.floor(len/2);
}

    }

    return s.substring(start, end+1);

}

let expand=(s,left,right)=>{

while(left>=0&&right<s.length&&s[left]===s[right]){
    left--;
    right++;
}

return right-left-1;

}


let s='babad';

console.log(longestPalindrome(s));