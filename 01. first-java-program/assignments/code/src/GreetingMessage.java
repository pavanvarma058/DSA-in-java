import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {

        // Q. Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + " very nice to meet you!");
    }
}
