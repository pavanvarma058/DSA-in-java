import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        // Q. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter Number: ");
            num = sc.nextInt();
            sum += num;
        }while (num != 0);
        System.out.println("Sum = " + sum);


    }
}
