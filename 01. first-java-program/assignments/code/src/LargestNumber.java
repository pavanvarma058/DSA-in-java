import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        long num1 = in.nextLong();
        System.out.print("Enter Number 2: ");
        long num2 = in.nextLong();

        long max = Math.max(num1, num2);
        System.out.println(max);
    }
}
