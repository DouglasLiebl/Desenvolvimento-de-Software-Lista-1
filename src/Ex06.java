import java.util.Scanner;

public class    Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double lampWattage, width, length, area, lampsNumber;

        System.out.println("Enter the wattage of the to be used: ");
        lampWattage = input.nextDouble();

        System.out.println("Enter the width of the room: ");
        width = input.nextDouble();

        System.out.println("Enter the length of the room: ");
        length = input.nextDouble();

        area = width * length;
        lampsNumber = (area * 18) / lampWattage;

        System.out.printf("Total number of lamps: %s", lampsNumber);
    }
}
