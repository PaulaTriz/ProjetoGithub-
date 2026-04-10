package Lista2;
import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha; ");
        String senha = sc.nextLine();

        if (senha.equals("1234")){
            System.out.println("Acesso Permitido!!");
        } else {
            System.out.println("Acesso Negado!!");
        }
        sc.close();
    }
}
