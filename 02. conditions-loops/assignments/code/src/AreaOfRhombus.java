import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Area of Rhombus
        // Formula = (d1 * d2) / 2
        System.out.print("Enter the first diagonal of rhombus: ");
        int d1 = in.nextInt();
        System.out.print("Enter the second diagonal of rhombus: ");
        int d2 = in.nextInt();
        int Area_of_rhombus = (d1 * d2) / 2;
        System.out.println("Area of Rhombus is: " + Area_of_rhombus);
    }
}
