public class EvenNumOfDigits {
    // link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int evenNums = findNumbers(nums);
        System.out.println(evenNums);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    public static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }
}
