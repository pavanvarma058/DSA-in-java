public class EvenDigits {
    // QuestionLink: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] nums = {12, 245, 2, 6, 7896};
        System.out.println(findNumbers(nums));

//        System.out.println(digits2(345589));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check whether a numbers contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    // count number of Digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)Math.log10(num) + 1;
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
