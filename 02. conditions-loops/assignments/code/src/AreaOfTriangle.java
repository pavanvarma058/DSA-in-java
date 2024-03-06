import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Q. Area of Triangle
        // Formula area = (base * height)/ 2
        Scanner in = new Scanner(System.in);
        int base, height;
        System.out.print("Enter input for Base: ");
        base = in.nextInt();
        System.out.print("Enter input for Height: ");
        height = in.nextInt();
        double area = (double) (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}
