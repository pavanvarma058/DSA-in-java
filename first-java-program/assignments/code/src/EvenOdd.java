import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // Q. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}