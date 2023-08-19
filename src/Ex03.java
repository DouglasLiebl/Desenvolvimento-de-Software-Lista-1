import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Insira seu nome: ");
        nome = input.nextLine();

        System.out.printf("Olá %s", nome);
    }
}
