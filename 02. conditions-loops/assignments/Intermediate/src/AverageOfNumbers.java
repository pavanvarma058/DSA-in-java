import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        // Q. Average of N numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = in.nextInt();
        int count = 1;
        float num,average,  sum = 0;
        while (count <= n){
            System.out.println("Enter the " + count + " number?");
            num = in.nextInt();
            sum += num;
            count++;
        }
        average = sum / n;
        System.out.println("The Average is " + average);

    }
}
