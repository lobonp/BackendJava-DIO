package projetos.BancoDigital;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino, String tipoTransferencia) {
		this.sacar(valor);
		if (tipoTransferencia.equalsIgnoreCase("TED") && cliente.getTipoPessoa().equalsIgnoreCase("juridica")) {
			contaDestino.depositar(valor - (valor * 0.01)); //TED desconta 1% do valor da transferencia de PJ
		} else if (tipoTransferencia.equalsIgnoreCase("pix")) {
			contaDestino.depositar(valor); //Pix manda valor inteiro
		} else if (tipoTransferencia.equalsIgnoreCase("credito")) {
			if (this.cliente.aprovaCompra(valor)) {
				contaDestino.depositar(valor);
			} else {
				return;
			}
		}
		this.cliente.atualizaScore(this.cliente.getScore() + 1);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Score: %d", this.cliente.getScore()));
		if (this.cliente.isCartaoCredito()) {
			System.out.println(String.format("Milhas: %d", this.cliente.getMilhas()));
			System.out.println(String.format("Fatura: %.2f", this.cliente.getFaturaCartaoCredito()));
		}
	}
}
