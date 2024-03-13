import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // Q. Curved Surface Area Of Cylinder
        // Formula Surface Area of Cylinder = 2 Π  (r + h)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        float surfaceArea = (float) (2 * Math.PI * (r + h));
        System.out.print("Surface Area of Cylinder: " + surfaceArea);

    }
}
