import java.util.Scanner;

public class MarksGrades {
    public static void main(String[] args) {
        // Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        System.out.print("Your grade is: ");
        grades(marks);

    }

    static void grades(int n){
        if(n >= 91 && n <= 100){
            System.out.println("AA");
        } else if (n >= 81 && n <= 90) {
            System.out.println("BB");
        } else if (n >= 71 && n <= 80) {
            System.out.println("CC");
        } else if (n >= 61 && n <= 70) {
            System.out.println("DD");
        } else if (n >= 51 && n <= 60) {
            System.out.println("EE");
        } else if (n >= 41 && n <= 50) {
            System.out.println("DD");
        }else if (n <= 40) {
            System.out.println("Fail");
        }
    }
}
