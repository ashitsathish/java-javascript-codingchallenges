package leetcode.easy.powerof2;

/**
 * Created by ashitsathish on Sep,2020
 */
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i<n){
            i*=2;
        }
        return i==n;
    }
}
