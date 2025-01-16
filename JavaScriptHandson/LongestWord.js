
function longestWord(str){
    const words=str.split(' ');

    let longestWord='';

    for(let word of words){
        if(word.length >longestWord.length){
            longestWord=word;
        }
    }
    return longestWord;

}

console.log(longestWord('Yesu Raja is a Software Engineer'));