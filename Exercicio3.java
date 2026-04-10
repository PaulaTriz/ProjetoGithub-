package Lista2;
import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: + idade");

        if (idade >= 18){
            System.out.println("Maior de idade: ");
        } else {
            System.out.println("Menor de idade: ");
        }
        sc.close();
    }
}
