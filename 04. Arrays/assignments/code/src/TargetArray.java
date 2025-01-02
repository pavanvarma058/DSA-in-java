import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    // link:   https://leetcode.com/problems/create-target-array-in-the-given-order/description/
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] targetArray = createTargetArray(nums, index);
        System.out.println(Arrays.toString(targetArray));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            arr.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for(int j=0; j<n; j++){
            target[j] = arr.get(j);
        }
        return target;
    }
}
