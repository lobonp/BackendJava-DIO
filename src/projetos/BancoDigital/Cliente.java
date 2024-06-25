package projetos.BancoDigital;

public class Cliente {
	private String nome;
	private String tipoPessoa;

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
}
