function removeDuplicates(arr){

    return [...new Set(arr)];

}

const array=[1,2,3,3,3,4,5,6,7,5,4,4,4,4];

function removeDup(arr){
   return arr.filter((val,index,self) => self.indexOf(val)==index);
}

console.log(removeDup(array));

