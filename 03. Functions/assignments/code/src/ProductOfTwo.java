import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        // [Define a method that returns the product of two numbers entered by user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();
        int ans = ProductOfTwoNum(n1, n2);
        System.out.println("Product of Two numbers: " + ans);
    }

    static int ProductOfTwoNum(int n1, int n2) {
        return n1 * n2;
    }
}
