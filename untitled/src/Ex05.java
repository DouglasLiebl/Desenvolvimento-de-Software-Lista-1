import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double raio, area;

        System.out.println("Insira o raio de determinado circulo: ");
        raio = input.nextDouble();

        area = 3.14 * (Math.pow(raio, 2));
        System.out.printf("A area do circulo é: %.2f", area);
    }
}
