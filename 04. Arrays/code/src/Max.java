import java.sql.Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 79, 18};
        System.out.println(max(arr));
    }

    // imagine that array is not empty
    // if array is empty use Array
    static int max(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
//        int maxVal = Integer.MIN_VALUE; // if array is empty use this.
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // work on edge cases here, like arr being null
    static int maxRange(int[] arr, int start, int end) {
        if(end > start) {
            return -1;
        }

        if(arr == null){
            return -1;
        }
//        int maxVal = Integer.MIN_VALUE; // if array is empty use this.
        int maxVal = start;
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
