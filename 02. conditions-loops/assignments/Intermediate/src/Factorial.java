import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Factorial Program In Java
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);

    }
}