import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
        if(rev == num){
            System.out.println("The given num is a palindrome number");
        } else {
            System.out.println("The given num is not a palindrome number");
        }
    }
}
