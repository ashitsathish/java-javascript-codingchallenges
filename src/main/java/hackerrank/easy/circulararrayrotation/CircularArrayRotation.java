package hackerrank.easy.circulararrayrotation;

/**
 * Created by ashitsathish on Aug,2020
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        circularArrayRotation(new int[]{1,2,3,4,5},3,new int[]{1,2});
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k = k%a.length;
        int lastIndex = a.length-1;

        reverseArray(a,0,lastIndex);
        reverseArray(a,0, k-1);
        reverseArray(a, k, lastIndex);

        int[] returnArray = new int[queries.length];
        for(int i=0; i< returnArray.length; i++){
            returnArray[i]= a[queries[i]];
        }
        return returnArray;
    }

    private static void reverseArray(int[] arr, int m, int n){
        while (m<n){
            int temp =0;
            temp = arr[m];
            arr[m] =arr[n];
            arr[n] = temp;
            m++;
            n--;
        }
    }
}
