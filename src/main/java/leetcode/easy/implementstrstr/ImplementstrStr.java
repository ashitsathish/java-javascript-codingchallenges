package leetcode.easy.implementstrstr;


public class ImplementstrStr {

    /**
     *
     * @param haystack - this is a string.
     * @param needle - this is a string.
     * @return Integer
     * "hello","ll"
     *
     */

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        if(m< n){
            return -1;
        }
        for(int i=0; i<= m-n; i++){
            int j=0;
            for( j=0; j< n ; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j== n){
                return i;
            }
        }
        return -1;
    }
}
