import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q. To find Armstrong Number between two given number.
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        for(int i = num1; i < num2; i++){
            int check, rem, sum = 0;
            check = i;
            while (check != 0){
                rem = check % 10;
                sum = sum + rem*rem*rem;
                check /= 10;
            }
            if(sum == i){
                System.out.println("" + i + " is an Armstrong number");
            }
        }
    }
}
