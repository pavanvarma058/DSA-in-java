import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(PrimeOrNot(n));

    }

    static String PrimeOrNot(int n){
        if(n <= 1){
            return n + " is neither Prime nor composite number";
        }

        int c = 2;
        while (c*c <= n){
            if(n%c==0){
                return n + " is not a Prime number";
            }
            c = c + 1;
        }
        return n + " is a Prime Number";
    }
}
