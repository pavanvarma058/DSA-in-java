public class SquarRoot {
    // link: https://leetcode.com/problems/sqrtx/description/
    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int start = 0;
        int end = x;
        int mid = -1;

        while(start<=end){
            mid = start + (end - start) / 2;

            if((long) mid*mid > (long) x){
                end = mid - 1;
            }else if(mid*mid < x){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Math.round(end);
    }
}