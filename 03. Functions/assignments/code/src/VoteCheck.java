import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = sc.nextInt();
        VoteEligibility(n);

    }

    static void VoteEligibility(int age){
        if(age >= 18){
            System.out.println("His/Her is Eligible for Vote.");
        }else {
            System.out.println("His/Her not Eligible for Vote.");
        }
    }
}
