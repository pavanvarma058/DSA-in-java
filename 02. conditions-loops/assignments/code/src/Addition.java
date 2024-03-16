import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Q. Addition Of Two Numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        long num1 = in.nextInt();
        System.out.print("Enter Number2: ");
        long num2 = in.nextInt();
        long add = num1 + num2;
        System.out.println("Addition of Two Numbers: " + add);
    }
}
