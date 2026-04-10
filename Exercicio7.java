package Lista2;
import java.util.Scanner;

public class Exercicio7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int número = sc.nextInt();

        if (número % 2 == 0){
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
        sc.close();
    }
}
