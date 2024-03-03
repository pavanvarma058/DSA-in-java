import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Price: ");
        float p = in.nextFloat(); // principal amount
        System.out.print("Enter Time: ");
        float t = in.nextFloat(); // time
        System.out.print("Enter Rate: ");
        float r = in.nextFloat(); // rate

        float simpleInterest = (p*t*r) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
