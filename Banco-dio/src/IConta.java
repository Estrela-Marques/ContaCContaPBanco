
public interface IConta {
	
	void sacar(double valor);
		
	void deositar(double valor);
	 
	void tranferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
