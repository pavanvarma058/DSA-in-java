import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q. Input currency in rupees and output in USD.
        System.out.print("Enter Amount in Rupees: ");
        double rupees = in.nextDouble();
        double dollars = rupees / 70.0;
        System.out.printf("%.2f rupees = %.2f dollars", rupees, dollars);
    }
}
