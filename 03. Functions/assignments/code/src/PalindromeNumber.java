import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Write a function to find if a number is a palindrome or not. Take number as parameter
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(NumFactorial(num)){
            System.out.println("The given number is a Factorial number");
        }else {
            System.out.println("The given number is not a Factorial Number");
        }

    }

    public static boolean NumFactorial(int n){
        int rev = 0;
        int temp = n;
        if(n < 1) return false;
        while (temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return n == rev;
    }
}
