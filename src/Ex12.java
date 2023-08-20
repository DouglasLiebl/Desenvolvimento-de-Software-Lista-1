import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kilometers, elapsedTime;

        System.out.println("Enter time elapsed between seeing lightning an hearing thunder: ");
        elapsedTime = input.nextDouble();

        kilometers = (elapsedTime * 340) / 1000;

        System.out.printf("You are at a distance of: %.2f km", kilometers);
    }
}
