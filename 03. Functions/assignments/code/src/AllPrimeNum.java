import java.util.Scanner;

public class AllPrimeNum {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("The Prime Numbers Between " + num1 + " and " + num2 + " are: ");
        for (int i = num1; i <= num2; i++) {
            if(PrimeOrNot(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean PrimeOrNot(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while (c*c <= n){
            if(n%c==0){
                return false;
            }
            c = c + 1;
        }
        return true;
    }
}
