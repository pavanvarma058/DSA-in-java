import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();
        int ans = SumOfTwoNum(n1, n2);
        System.out.println("Sum of Two numbers: " + ans);
    }

    static int SumOfTwoNum(int n1, int n2) {
        return n1 + n2;
    }
}
