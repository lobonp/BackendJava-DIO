package projetos.BancoDigital;

public class Cliente {
	private String nome;
	private String tipoPessoa;
	private int score; //score do cliente para liberar cartão de credito
	private boolean cartaoCredito; //possui cartão de credito (necessario score >= 5)
	private int milhas; //milhas do cliente acumuladas por usar cartão de credito
	private double faturaCartaoCredito; //fatura do cartão de crédito

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	@Override
	public String toString() {
		if (this.tipoPessoa == "fisica") {
			return this.nome + " - Pessoa Física";
		} else {
			return this.nome + " - Pessoa Jurídica";
		}
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
}
