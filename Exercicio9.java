package Lista2;
import java.util.Scanner;

public class Exercicio9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra do produto: ");
        double valor = sc.nextDouble();

        double total;

        if (valor > 100){
            total = valor * 0.9;//com 10% de desconto
            System.out.println("Desconto aplicado.");
        } else {
            total = valor;
            System.out.println("Sem desconto: ");
        }
        sc.close();

    }
}
