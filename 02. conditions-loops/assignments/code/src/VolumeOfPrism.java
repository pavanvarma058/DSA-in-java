import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        // Q. Volume of Prism
        // Formula V = B × h [Volume of a prism formula
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of base: ");
        double base = in.nextDouble();
        System.out.print("Enter the height: ");
        double height = in.nextDouble();



        double  area=base*height ;
        System.out.println("Volume Of Prism is: " + area);
    }
}
