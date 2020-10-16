function majorityElement(nums){
    if(nums.length==0) return nums[0];
    let obj = {};
    for(let i of nums){
        obj[i] = (obj[i]||0)+1;
    }
    for(let key in obj){
        if(obj[key] > nums.length/2){
            return key;
        }
    }
}

console.log(majorityElement([2,2,1,1,1,2,2]));