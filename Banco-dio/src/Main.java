
public class Main {

	public static void main(String[] args) {
		Cliente estrela = new Cliente();
		estrela.setNome("Estrela");
		
		
		IConta cc = new ContaCorrente(estrela);			
		IConta poupanca= new ContaPoupanca(estrela);
		
		cc.deositar(100);
		cc.tranferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
