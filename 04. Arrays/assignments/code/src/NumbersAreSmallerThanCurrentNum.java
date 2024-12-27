import java.util.Arrays;

public class NumbersAreSmallerThanCurrentNum {
    // link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int length = 0;
            int num = nums[i];
            for(int j=0; j<nums.length; j++){
                if(num - nums[j] > 0 && num != nums[j]){
                    length += 1;
                }
            }
            arr[i] = length;
        }
        return arr;
    }
}
