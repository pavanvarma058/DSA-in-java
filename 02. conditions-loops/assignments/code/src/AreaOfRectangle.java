import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Area Of Rectangle Program
        // Formula: area = length * width
        System.out.print("Enter Length: ");
        int length = in.nextInt();
        System.out.print("Enter Width: ");
        int width = in.nextInt();
        int area = length * width;
        System.out.println("Area of Rectangle is: ");
    }
}
