import java.util.Arrays;

public class SumOf1DArray {

    // link: https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] numArr){
        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = numArr[i] + numArr[i - 1];
        }
        return numArr;
    }
}
