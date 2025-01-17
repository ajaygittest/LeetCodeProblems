const originalString="Hello";

console.log(reverseString(originalString));

function reverseString(str){
    let reverse='';
    for(let i=str.length-1; i>=0;i--){
            reverse+=str[i];
    }
    return reverse;
}