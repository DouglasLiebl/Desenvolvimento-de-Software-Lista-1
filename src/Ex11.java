import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int odometerAtStart, odometerAtEnd;
        double consumedLiters, totalAmount, dayProfit, averageConsumption;

        System.out.println("Enter odometer markup at start of the day: ");
        odometerAtStart = input.nextInt();

        System.out.println("Enter odometer markup at end of the day: ");
        odometerAtEnd = input.nextInt();

        System.out.println("Enter total fuel consumption: ");
        consumedLiters = input.nextDouble();

        System.out.println("Enter the total profit of the day: ");
        totalAmount = input.nextDouble();

        averageConsumption = (odometerAtEnd - odometerAtStart) / consumedLiters;
        dayProfit = totalAmount - (consumedLiters * 1.90);

        System.out.printf("Average Consumption: %.2f Km/L \nDay Profit: R$ %.2f", averageConsumption, dayProfit);

    }
}
