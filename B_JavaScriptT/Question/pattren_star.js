let n=3;
// let string="";
// // external loop
// for(let i=0; i<=n; i++){
//     // space
//     for(let j=0; j<n-i; j++){
//        string+=" ";
//     }
//     // star
//     for(let k=1; k<2*i; k++){
//         string+="*";    // string+=k; 1 /123/ 12345
//     }
//     string+="\n";
// }
// console.log(string);

/*       *
        ***
       *****
      *******
     *********
     */

 let string="";
 let count=1;
 for(let i=0; i<=n; i++){
    for(let j=0; j<n-i; j++){
        string+=" ";
    }
    for(let k=0; k<2*i-1; k++){
        string+=count;
        count++;
    }
    string+="\n";
 }
console.log(string);