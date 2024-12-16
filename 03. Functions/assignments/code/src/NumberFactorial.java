import java.util.Scanner;

public class NumberFactorial {
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ans = FactorialNum(num);
        System.out.println("Factorial of a given number is: " + ans);
    }

    public static int FactorialNum(int n) {
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans = ans * i;
        }
        return ans;
    }
}
