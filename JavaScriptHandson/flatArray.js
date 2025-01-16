function flatedArray(arr){
    let flatArry=[];

    arr.forEach(item =>{
        if(Array.isArray(item)){
            flatArry=flatArry.concat(flatedArray(item));
        }else{
            flatArry.push(item);
        }
    });
    return flatArry;
}


console.log(flatedArray([1,[2,3[4,4],4,5,5],4,4,5]))