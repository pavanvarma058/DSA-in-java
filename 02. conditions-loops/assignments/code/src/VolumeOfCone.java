import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        // Q. Volume of Cone
        // Formula volume of cone= pie x r2 x h/3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = in.nextInt();
        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        double pi = Math.PI;
        double volume = pi * (r * r) * h / 3;
        System.out.println("Volume of Cone: " + volume);
    }
}
