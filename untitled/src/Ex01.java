import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Insira a nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Insira a nota 2: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("A média é: %.2f", media);
    }
}