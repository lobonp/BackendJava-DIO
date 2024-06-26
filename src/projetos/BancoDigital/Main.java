package projetos.BancoDigital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente pedro = new Cliente("Pedro", "Fisica");
		Cliente kabum = new Cliente("Kabum", "Juridica");
		Cliente microsoft = new Cliente("Microsoft", "Juridica");

		Conta pedro_cc = new ContaCorrente(pedro);
		Conta pedro_poupanca = new ContaPoupanca(pedro);

		pedro_cc.imprimirExtrato();
		pedro_poupanca.imprimirExtrato();

		Conta kabum_cc = new ContaCorrente(kabum);
		kabum_cc.imprimirExtrato();

		Conta microsoft_cc = new ContaCorrente(microsoft);
		microsoft_cc.imprimirExtrato();

		pedro_cc.depositar(1000);
		kabum_cc.depositar(100);
		microsoft_cc.depositar(50000);

		pedro_cc.transferir(100, pedro_poupanca, "TED");
		pedro_cc.transferir(10, kabum_cc, "pix");
		pedro_cc.transferir(10, kabum_cc, "pix");
		pedro_cc.transferir(10, kabum_cc, "pix");
		pedro_cc.transferir(10, kabum_cc, "pix");

		//simulando pagamento de salario por TED
		microsoft_cc.transferir(1800, pedro_cc, "TED");

		//simulando compra com cartao de credito em loja
		pedro_cc.transferir(500, kabum_cc, "credito");

		System.out.println(pedro.getScore());
	}

}
