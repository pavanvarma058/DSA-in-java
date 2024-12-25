import java.util.ArrayList;
import java.util.List;

public class NumberOfCandies {
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<>(n);

        int max = candies[0];
        for(int i=1; i<n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i<n; i++){
            if(candies[i] + extraCandies >= max){
                result.add(i, true);
            }else {
                result.add(i, false);
            }
        }

        return result;
    }
}
