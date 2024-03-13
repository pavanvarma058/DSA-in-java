import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Q. Volume of Cylinder
        // Formula V=pie x r2 x h
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = in.nextInt();
        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        double pie = Math.PI;
        double volume = pie * (r * r) * h;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
