function  intersection(arr1,arr2){
    const set1=new Set(arr1);

    const result=arr2.filter(item =>set1.has(item));

   return [...new Set(result)];
}


console.log(intersection([2,3,34,44,,5,5,5,6,6,7,7],[1,2,3,3,4,5,6,5,6,6,6]))