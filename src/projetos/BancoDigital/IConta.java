package projetos.BancoDigital;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino, String tipoTransferencia);
	
	void imprimirExtrato();
}
