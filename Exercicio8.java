package Lista2;
import java.util.Scanner;

public class Exercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int número = sc.nextInt();

        if(número > 0) {
            System.out.println("O número e positivo: ");
        } else if(número > 0) {
            System.out.println("O número e negativo: ");
        } else {
            System.out.println("O número e zero: ");
        }
        sc.close();
    }
}
