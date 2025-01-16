function countCharacters(str){
    const counts={};

    for(let char of str){
        if(counts[char]){
            counts[char]++;
        }else{
            counts[char]=1;
        }
    }
    return counts;
}

const input='HelloWorld';
const characters=countCharacters(input);
console.log(characters);