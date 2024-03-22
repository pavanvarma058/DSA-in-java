import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        // Q. Calculate Discount Of Product
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double priceOfProduct = in.nextDouble();
        System.out.print("Enter the Discount: ");
        double discount = in.nextDouble();
        double s = 100 - discount;
        double amount = (s * priceOfProduct) / 100;
        System.out.println("Final Price of Product after giving discount: " + amount);
    }
}
