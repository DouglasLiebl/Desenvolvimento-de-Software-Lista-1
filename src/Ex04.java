import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalConsumido, valorDaConta;

        System.out.println("Insira o total de KW consumidos no mês: ");
        totalConsumido = input.nextDouble();

        valorDaConta = totalConsumido * 0.55;
        System.out.printf("Valor total: R$ %.2f", valorDaConta);
    }
}
