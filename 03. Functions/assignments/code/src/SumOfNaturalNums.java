import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ans = SumOfN(num);
        System.out.println(ans);

    }
    public static int SumOfN(int n){
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }

        // formula n * (n+1)/2
        return n * (n + 1) / 2;
    }
}
