import java.util.Scanner;

public class PerimeterOfEquiTriangle {
    public static void main(String[] args) {
        // Q. Perimeter of Equilateral Triangle
        // Formula = 3a
        Scanner in = new Scanner(System.in);
        System.out.print("Enter area: ");
        double a = in.nextDouble();
        double perimeter = 3*a;
        System.out.println("Perimeter of a Equilateral Triangle: " + perimeter);
    }
}
