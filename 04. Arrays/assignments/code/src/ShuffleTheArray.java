import java.util.Arrays;

public class ShuffleTheArray {
    // link: https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] res = shuffle(arr, n);
        System.out.println(Arrays.toString(res));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];

        for(int i=0; i<n; i++){
            arr[2*i] = nums[i];
            arr[(2*i) + 1] = nums[i+n];
        }
        return arr;
    }
}
