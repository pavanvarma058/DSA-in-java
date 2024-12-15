import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        CheckEvenOrOdd(n);
    }

    static void CheckEvenOrOdd(int n) {
        if(n % 2 == 0){
            System.out.println(n + " is a even number");
        }else {
            System.out.println( n + " is a odd number");
        }
    }
}
