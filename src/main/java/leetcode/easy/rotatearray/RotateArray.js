
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k = k = k%nums.length;
    swap(nums, 0, nums.length-1);
    swap(nums,0, k-1);
    swap(nums, k, nums.length-1);
    console.log(nums)
};

function swap(nums,i, j) {
    while(i<j){
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
}


rotate([1,2,3,4,5,6,7],3);