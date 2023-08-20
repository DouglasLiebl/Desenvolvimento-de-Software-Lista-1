import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double firstGrade, secondGrade, average;

        System.out.println("Enter the first grade: ");
        firstGrade = input.nextDouble();

        System.out.println("Now enter the second grade: ");
        secondGrade = input.nextDouble();

        average = (firstGrade + secondGrade) / 2;

        System.out.printf("Average: %.2f", average);
    }
}