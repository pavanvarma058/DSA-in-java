import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Area of Parallelogram
        // Formula : base * height
        System.out.print("Enter Base: ");
        int b = in.nextInt();
        System.out.print("Enter Height: ");
        int h = in.nextInt();
        double area = (double) b * h;
        System.out.println("Area of Parallelogram: " + area);

    }
}
