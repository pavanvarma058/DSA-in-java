import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        // Q. Perimeter of Square
        // Formula p = 4*a
        Scanner in = new Scanner(System.in);
        System.out.print("Enter area: ");
        double a = in.nextDouble();
        double p = 4 * a;
        System.out.println("Perimeter of Square is: " + p);
    }
}
