package leetcode.easy.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ashitsathish on Sep,2020
 * $$$$  $$$$
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i: nums){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }
}
