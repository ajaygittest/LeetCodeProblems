function nonRepeat(str){
    const frequencyMap={};

    for(const ele of str){
        if(frequencyMap[ele]){
            frequencyMap[ele]+=1;
        }else{
            frequencyMap[ele]=1;
        }
    }

    for(const char of str){
        if(frequencyMap[char]==1){
            return char;
        }
    }
    return null;
}


console.log(nonRepeat('swisldkdls2ws'))