import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Q. Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        int num;
        int largest = 0;

        do {
            System.out.print("Enter Number: ");
            num = in.nextInt();
            if(num > largest){
                largest = num;
            }
        }while (num != 0);
        System.out.println("Largest Number = " + largest);
    }
}
