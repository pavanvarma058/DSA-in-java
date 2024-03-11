import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        // Q. Perimeter of Circle
        // Perimeter of the circle:  P =2 *  π * r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = in.nextDouble();
        double circle = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle: " + circle);
    }
}
