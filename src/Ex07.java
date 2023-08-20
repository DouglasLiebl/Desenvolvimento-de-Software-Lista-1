import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name, nationality;
        int age;
        double weight;

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your nationality: ");
        nationality = input.nextLine();

        System.out.printf("Name: %s \nAge: %s \nWeight: %s \nNationality: %s", name, age, weight, nationality);
    }
}
