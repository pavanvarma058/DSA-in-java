import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        // Q. Volume of Pyramid
        // Formula pyramid volume=1/3*base area*height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area: ");
        int base = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();
        double volume = (double) 1 /3 * base * height;
        System.out.println("Volume of Pyramid: " + volume);
    }
}
