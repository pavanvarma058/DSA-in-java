
public class SmallerThanCurrentNum {
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
    public static void main(String[] args) {
        
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
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