let n=12345;
let reverse=0;
while(n>0){
    reverse=reverse*10+n%10;
    n=parseInt(n/10);
}
console.log(reverse);

// 54321