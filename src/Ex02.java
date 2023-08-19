import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        System.out.println("Insira a base menor: ");
        baseMenor = input.nextDouble();

        System.out.println("Insira a base maior: ");
        baseMaior = input.nextDouble();

        System.out.println("Insira a altura: ");
        altura = input.nextDouble();

        area = ((baseMenor + baseMaior) * altura) / 2;

        System.out.printf("A área do trapézio é: %s", area);
    }
}
