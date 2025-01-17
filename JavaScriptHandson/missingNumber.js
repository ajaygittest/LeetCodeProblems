function missingNumber(str){
    const n=str.length+1;

    const totalNum=(n*(n+1))/2;

    const arraySum=str.reduce((acc,num)=>acc+num,0);


    return totalNum-arraySum;
}


function missNum(str){

    const n=str.length+1;
    const numberSet = new Set(str);

    for(let i=1; i<=n;i++){
        if(!numberSet.has(i)){
            return i;
        }
    }
}

console.log(missNum([1,2,4,5,6]))