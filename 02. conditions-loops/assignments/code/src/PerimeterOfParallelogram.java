import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        // Q. Perimeter Of Parallelogram
        // Formula P = 2(h + b)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the Parallelogram: ");
        double h = in.nextDouble();
        System.out.print("Enter the breadth of the Parallelogram: ");
        double b = in.nextDouble();
        double p = 2 * (h + b);
        System.out.println("Perimeter of Parallelogram: " + p);
    }
}
