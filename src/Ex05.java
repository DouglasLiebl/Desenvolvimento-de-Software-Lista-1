import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius, area;

        System.out.println("Enter radius of given circle: ");
        radius = input.nextDouble();

        area = 3.14 * (Math.pow(radius, 2));
        System.out.printf("The area of the circle is: %.2f", area);
    }
}
