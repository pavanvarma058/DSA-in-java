import java.util.Arrays;

public class RichestCustomerWealth {
    // link: https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
//        int[][] accounts = new int[2][];
        int[][] accounts = {
        {1, 2, 3},
        {3, 2, 1},
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for(int[] i : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }

            if(sum > ans){
                ans = sum;
            }
        }

        return ans;
    }
}
