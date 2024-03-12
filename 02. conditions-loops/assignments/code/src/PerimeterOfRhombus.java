import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        // Q. Perimeter of Rhombus
        // Formula Perimeter of rhombus = 4 x a units (Where 'a' is the side of rhombus)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side: ");
        float a = in.nextFloat();
        float p = 4 * a;
        System.out.println("Perimeter of Rhombus: " + p);
    }
}
