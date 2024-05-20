package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        System.out.println("-----Olá, seja bem vindo(a) ao nosso banco!-----");
        System.out.println("-----Insira os dados que se pedem a seguir:-----");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome:");
        String nome = scanner.next();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu numero:");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá , " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
