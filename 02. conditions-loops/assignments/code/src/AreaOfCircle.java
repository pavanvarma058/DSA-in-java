import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Q. Area Of Circle Java Program
        // Formula area = pi * (radius * radius)
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int radius = in.nextInt();
        double pi = 3.142, area;
        area = pi * (radius * radius);
        System.out.println("Area of Circle is: " + area);
    }
}