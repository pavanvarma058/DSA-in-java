import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//        System.out.println(isArmStrong(n));
        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)){
                System.out.print(i + " is Armstrong number");
                System.out.println();
            }
        }
    }

    // print all the 3 digit armstrong numbers
    // Cube of individual digits and sum that numbers which will give the same result as the given number then the number is said to be Armstrong number.
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
