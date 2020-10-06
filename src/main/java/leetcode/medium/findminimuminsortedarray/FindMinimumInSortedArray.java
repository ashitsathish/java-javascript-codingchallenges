package leetcode.medium.findminimuminsortedarray;

/**
 * Created by ashitsathish on Oct,2020
 */
public class FindMinimumInSortedArray {
    public static void main(String[] args) {
        findMin(new int[]{3,4,5,1,2});
    }


    public static int findMin(int[] nums) {
        if(nums.length==0) return -1;
        if(nums.length==1) return nums[0];

        int left =0;
        int right = nums.length-1;
        while (left<right){
            int midpoint = left + (right-left)/2;
            if(midpoint>0 && nums[midpoint]< nums[midpoint-1]){   // if midpoint = 0 we get index out of bound exception.
                return nums[midpoint];
            }else if(nums[left]<= nums[midpoint] && nums[midpoint]> nums[right]){
                left = midpoint + 1;
            }else{
                right = midpoint -1;
            }
        }
        return nums[left];
    }
}
