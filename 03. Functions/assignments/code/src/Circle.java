import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // write a program to print the circumference and area of a circle of radius entered by user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double areaOfCircle = AreaOfCircle(radius);
        System.out.printf("Area of Circle for given radius is: %.2f", areaOfCircle);

        double circumference = CircumferenceOfCircle(radius);
        System.out.printf("\nCircumference of a Circle for given radius is: %.2f", circumference);


    }

    static double AreaOfCircle(double rad){
        // formula PI*Rad*Rad
        double area = Math.PI * (rad * rad);
        return area;
    }

    static double CircumferenceOfCircle(double rad){
        // formula 2*PI*Rad
        double circumference = 2 * Math.PI * rad;
        return circumference;
    }
}
