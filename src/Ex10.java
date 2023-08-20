import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double length, width, height, tileBoxesNumber;

        System.out.println("Enter the length of the kitchen: ");
        length = input.nextDouble();

        System.out.println("Enter the width of the kitchen: ");
        width = input.nextDouble();

        System.out.println("Enter the height of the kitchen: ");
        height = input.nextDouble();

        tileBoxesNumber = (((length * height) * 2) + ((width * height) * 2)) / 1.5;
        tileBoxesNumber = Math.round(tileBoxesNumber);

        System.out.printf("Number of tile boxes needed: %.0f", tileBoxesNumber);
    }
}
