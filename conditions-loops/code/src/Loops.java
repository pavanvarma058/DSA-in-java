import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of for loops
        for(initialisation; condition; increment/decrement){
         // body
        }
        */

        // Q: Print numbers from 1 to 5
//        for(int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }

        // Print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = in.nextInt();
//
//        for (int i = 1; i <= n; i++) {
////            System.out.print(i);
//            System.out.println("Hello World!");
//        }

        // while loops
        /*
        Syntax of while loops
        while(condition){
            // body
        }
        */

//        int n = 1;
//        while(n <= 5){
//            System.out.println(n);
//            n++;
//        }

        // do while loop
        /*
        do {

        } while(condition);
        */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 5);
    }
}
