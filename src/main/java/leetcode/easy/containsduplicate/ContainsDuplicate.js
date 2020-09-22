/*
    $$$$
 */

let containsDuplicate = function(nums) {
    let set = new Set();
    for(const i of nums){
        if(set.has(i)){
            return true;
        }else {
            set.add(i);
        }
    }
    return false;
};

console.log(containsDuplicate([1,2,3,4]));
console.log(containsDuplicate([1,1,1,3,3,4,3,2,4,2]));
