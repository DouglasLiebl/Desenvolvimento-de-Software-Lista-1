import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, nacionalidade;
        int idade;
        double peso;

        System.out.println("Insira o seu nome: ");
        nome = input.nextLine();

        System.out.println("Insira a sua idade: ");
        idade = input.nextInt();

        System.out.println("Insira o seu peso: ");
        peso = input.nextDouble();
        input.nextLine();

        System.out.println("Insira a sua Nacionalidade: ");
        nacionalidade = input.nextLine();

        System.out.printf("Nome: %s \nIdade: %s \nPeso: %s \nNacionalidade: %s", nome, idade, peso, nacionalidade);
    }
}
