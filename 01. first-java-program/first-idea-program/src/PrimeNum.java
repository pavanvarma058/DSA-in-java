import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        // To check whether a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(primeornot(n));
    }

    public static String primeornot(int n){
        if(n<=1){
            return "neither prime nor composite";
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return n + " is not a prime number";
            }
            c = c + 1;
        }
        return n + " is a Prime number";
    }
}
