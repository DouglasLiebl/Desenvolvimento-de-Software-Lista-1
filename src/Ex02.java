import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double biggerBase, minorBase, height, area;

        System.out.println("Enter the minor base value: ");
        minorBase = input.nextDouble();

        System.out.println("Enter the bigger base value: ");
        biggerBase = input.nextDouble();

        System.out.println("Enter the height value: ");
        height = input.nextDouble();

        area = ((minorBase + biggerBase) * height) / 2;

        System.out.printf("The area of the trapezoid is: %.2f", area);
    }
}
