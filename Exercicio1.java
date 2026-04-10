package Lista2;
import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número: ");
        numero = sc.nextInt();

        if (numero % 2==0 ) {
            System.out.println("O numero e par: ");
        } else {
            System.out.println("O nuemero e impar: ");
        }
        sc.close();
    }

}
