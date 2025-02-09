import java.util.Arrays;

public class PlusOne {
    // link: https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}
