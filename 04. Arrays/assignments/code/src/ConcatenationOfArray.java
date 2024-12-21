import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {

    // link: https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
//        int[] nums = {1, 2, 1};
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Enter the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = getConcatenation(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
