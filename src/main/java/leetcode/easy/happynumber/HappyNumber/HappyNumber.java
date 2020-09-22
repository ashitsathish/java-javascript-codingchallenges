package leetcode.easy.happynumber.HappyNumber;

import java.util.HashSet;

/**
 * Created by ashitsathish on Sep,2020
 */
// 19
public class HappyNumber {

    public static void main(String[] args) {
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seenSum = new HashSet();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (seenSum.contains(sum)) {
                return false;
            }
            seenSum.add(sum);
            n = sum;
        }
        return true;
    }
}
