package leetcode.easy.majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashitsathish on Oct,2020
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] nums){
        if(nums.length==1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i) && map.get(i)+1> nums.length/2){
                return i;
            }else{
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        return -1;
    }
}
