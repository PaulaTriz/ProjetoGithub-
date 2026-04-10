package Lista2;
import java.util.Scanner;

public class Exercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;

        if (media>=7){
            System.out.println("Voce esta aprovado: ");
        } else{
            System.out.println("Voce esta reprovado: ");
        }
        sc.close();
    }
}
