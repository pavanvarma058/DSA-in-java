import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter Operator: ");
        char op = in.next().trim().charAt(0);
        int ans = 0;

        if(op == '+'){
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*'){
            ans = num1 * num2;
        } else if (op == '/') {
            if(num2 != 0){
                ans = num1 / num2;
            }
        }else {
            System.out.println("Invalid Operator");
        }
        System.out.println(ans);


    }
}
