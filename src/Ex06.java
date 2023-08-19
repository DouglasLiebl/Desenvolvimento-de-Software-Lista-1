import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double potencia, largura, comprimento, area, nLampadas;

        System.out.println("Insira a potencia da lampada utilizada: ");
        potencia = input.nextDouble();

        System.out.println("Insira a largura do comodo: ");
        largura = input.nextDouble();

        System.out.println("Insira o comprimento do comodo: ");
        comprimento = input.nextDouble();

        area = largura * comprimento;
        nLampadas = (area * 18) / potencia;
        System.out.printf("Total de lampadas: %s", nLampadas);
    }
}
