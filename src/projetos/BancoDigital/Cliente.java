package projetos.BancoDigital;

public class Cliente {
	private String nome;
	private String tipoPessoa;
	private int score; //score do cliente para liberar cartão de credito
	private boolean cartaoCredito; //possui cartão de credito (necessario score >= 5)
	private int milhas; //milhas do cliente acumuladas por usar cartão de credito
	private double faturaCartaoCredito; //fatura do cartão de crédito
	private double limiteCredito;

	public Cliente(String nome, String tipoPessoa) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.score = 0;
		this.cartaoCredito = false;
		this.milhas = 0;
		this.faturaCartaoCredito = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public boolean isCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(boolean cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public int getMilhas() {
		return milhas;
	}

	public void setMilhas(int milhas) {
		this.milhas = milhas;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getFaturaCartaoCredito() {
		return faturaCartaoCredito;
	}

	public void setFaturaCartaoCredito(double faturaCartaoCredito) {
		this.faturaCartaoCredito = faturaCartaoCredito;
	}

	public double getLimiteCredito() {
		return this.limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public void atualizaScore(int score) {
		setScore(score);
		if (this.score % 5 == 0 && !this.cartaoCredito) {
			setCartaoCredito(true);
			setLimiteCredito(this.getLimiteCredito() + 1000);
		}
	}

	public boolean aprovaCompra(double valor) {
		if (this.faturaCartaoCredito + valor > this.limiteCredito) {
			System.out.println("Compra recusada. Não há limite disponível");
			return false;
		} else {
			this.setFaturaCartaoCredito(this.faturaCartaoCredito + valor);
			this.setMilhas(this.getMilhas() + 1);
			return true;
		}
	}

	public void pagarFatura(double pagamento){
		this.setFaturaCartaoCredito(this.getFaturaCartaoCredito() - pagamento);
		if (this.getFaturaCartaoCredito() > 0) {
			System.out.printf("%s, R$ %.2f da sua fatura foram pagos, restam:%n", this.getNome(), pagamento);
			System.out.printf("R$ %.2f%n", this.getFaturaCartaoCredito());
		} else {
			System.out.println("Fatura paga. Nao há mais débitos.");
		}
	}

	@Override
	public String toString() {
		if (this.tipoPessoa.equalsIgnoreCase("fisica")) {
			return this.nome + " - Pessoa Física";
		} else {
			return this.nome + " - Pessoa Jurídica";
		}
	}
}
