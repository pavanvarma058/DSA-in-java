import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Area of Isosceles triangle
        // Area_of_Isosceles_Triangle= (1 * b * h) / 2;
        // It is a formula for calculating  area of Isosceles Triangle.
        int base, height;
        System.out.print("Enter Base: ");
        base = in.nextInt();
        System.out.print("Enter Height: ");
        height = in.nextInt();
        double IsoscelesTriangle = (double) (1 * base * height) / 2;
        System.out.println("Area of Isosceles Triangle is: " + IsoscelesTriangle);

    }
}
