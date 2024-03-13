import java.util.Scanner;

public class ProductandSum {
    public static void main(String[] args) {
        // Q. Subtract the product and sum of digits of an integer
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            product = product * rem;
            sum = sum + rem;
        }
        int result = product - sum;
        System.out.println(result);
    }
}
