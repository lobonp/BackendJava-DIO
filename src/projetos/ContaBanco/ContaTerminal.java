package projetos.ContaBanco;

import java.util.Scanner;

/**
 * @author Pedro Lôbo Nascimento
 */

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta "+ numero +" e seu saldo "+ saldo + " já está disponível para saque");
    }
}