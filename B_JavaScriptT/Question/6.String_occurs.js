// let str="ababscda";
// let letter="a";
// let count=0;
// for(let i=0; i<str.length;i++){
//     if(str.charAt(i)==letter){
//         count++;
//     }
// }
// console.log(count); // a-3;

let str ="ssssbhsbh";
count=1;
for(let i=0; i<str.length;i++){
    if(str[i]===str[i+1]){
        count++;

    }
    else{
        console.log(str[i]+" "+count);
        count=1;
    }
}

