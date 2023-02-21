let n=372;
let c=n;
let rem=0;
let arm=0;
while(n>0){
    rem=n%10;
    arm=(rem*rem*rem)+arm;
    n=parseInt(n/10);
}
if(c==arm){
    console.log("armstrong");
}
else{
    console.log("not armstrong")
}

// 153  370 407