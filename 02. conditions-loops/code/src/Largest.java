import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int a = in.nextInt();
        System.out.print("Enter a number2: ");
        int b = in.nextInt();
        System.out.print("Enter a number3: ");
        int c = in.nextInt();

        // Q. Find largest of numbers
//        int max = a;
//        if(max < b){
//            max = b;
//        }
//        if (max < c){
//            max = c;
//        }

        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);

    }
}
