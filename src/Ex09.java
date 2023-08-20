import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double BRL, US, exchangeRate;

        System.out.println("Enter the amount you want calculate: ");
        BRL = input.nextDouble();

        System.out.println("Enter the current dollar exchange rate: ");
        exchangeRate = input.nextDouble();

        US = BRL * exchangeRate;

        System.out.printf("\nBRL = %.2f \nQuotation = %.2f \nBRL -> US = %.2f", BRL, exchangeRate, US);

    }
}
