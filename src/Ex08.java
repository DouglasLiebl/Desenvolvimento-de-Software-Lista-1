import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int unitsNumber;
        double unitPrice, discountPercentage, totalValue;

        System.out.println("Enter the name of the product: ");
        name = input.nextLine();

        System.out.println("Enter the quantity purchased: ");
        unitsNumber = input.nextInt();

        System.out.println("Enter the price of the product: ");
        unitPrice = input.nextDouble();
        input.nextLine();

        System.out.println("Enter the discount percentage: ");
        discountPercentage = input.nextDouble();

        totalValue = (unitPrice * unitsNumber) * (1 - (discountPercentage /100));
        System.out.printf("Product: %s \nTotal value: R$ %.2f", name, totalValue);
    }

}
