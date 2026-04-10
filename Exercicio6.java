package Lista2;
import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int número1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int número2 = sc.nextInt();

        if (número1 > número2){
            System.out.println("O maior número é: " + número1);
        } else if (número2>número1) {
            System.out.println("O maior número é: " + número2);
        } else {
            System.out.println("Os dois números são iguais: ");
        }
        sc.close();
    }
}
