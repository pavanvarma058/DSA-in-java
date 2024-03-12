import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Q. Perimeter of Rectangle
        // Formula p = 2*(height + width)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height: ");
        float h = in.nextFloat();
        System.out.print("Enter Width: ");
        float w = in.nextFloat();
        float p = 2 * (h + w);
        System.out.println("Perimeter of Rectangle is: " + p);
    }
}
