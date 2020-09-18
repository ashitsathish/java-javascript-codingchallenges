// nums = [3,2,2,3] val =3
// [2,2,any,any]



function removeElement(nums, val){
    let index = 0;
    for(let i = 0; i< nums.length; i++){
        if(nums[i]!= val){
            nums[index++]= nums[i];
        }
    }
    console.log(nums)
    return nums;
}


removeElement([0,1,2,2,3,0,4,2],2);