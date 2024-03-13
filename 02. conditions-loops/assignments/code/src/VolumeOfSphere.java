import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Q. Volume of sphere
        // Formula Volume= (4/3)*pie*r3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        double pie = Math.PI;
        double volume = (4.0/3.0) * pie * (r * r * r);
        System.out.println("Volume of the Sphere: " + volume);
    }
}
