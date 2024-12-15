import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number
        // respectively among three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int n3 = sc.nextInt();
        int Maximum = max(n1,n2,n3);
        int Minimum = min(n1, n2, n3);
        System.out.println("The maximum among the given numbers is: " + Maximum);
        System.out.println("The minimum among the given numbers is: " + Minimum);
    }

    static int max(int n1, int n2, int n3) {
        int max = n1;
        if(max < n2){
            max = n2;
        } else if (max < n3) {
            max = n3;
        }
        return max;
    }

    static int min(int n1, int n2, int n3) {
        int min = n1;
        if(min > n2){
            min = n2;
        } else if (min > n3) {
            min = n3;
        }
        return min;
    }
}