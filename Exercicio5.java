package Lista2;
import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int número = sc.nextInt();

        if (número % 2 == 0 && número % 3 == 0){
            System.out.println("É divisivel por 2 e por 3 ao mesmo tempo: ");
        } else {
            System.out.println("Não e divisivel por 2 e por 3 ao mesmo tempo: ");
        }
        sc.close();

    }
}
