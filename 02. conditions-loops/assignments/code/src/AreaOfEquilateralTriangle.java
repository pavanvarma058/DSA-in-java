import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        // Q. Area Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        // Formula A = (√3/4)a² Area of Equilateral Triangle= ( 1.73 × a × a)/4
        System.out.print("Enter a Number: ");
        float num = in.nextFloat();
        double area = (1.73 * num * num) / 4;
        System.out.println("Area of Equilateral Triangle: " + area);

    }
}
