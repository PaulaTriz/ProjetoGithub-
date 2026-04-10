package Lista2;
import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0) {
            System.out.println("É multiplo de 5: ");
        } else {
            System.out.println("Não é multiplo de 5: ");
        }

        sc.close();
       }
    }