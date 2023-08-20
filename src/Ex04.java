import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalConsumed, invoice;

        System.out.println("Enter the total KW consumed in the month: ");
        totalConsumed = input.nextDouble();

        invoice = totalConsumed * 0.55;
        System.out.printf("Invoice: R$ %.2f", invoice);
    }
}
