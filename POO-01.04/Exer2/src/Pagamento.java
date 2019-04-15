
public enum Pagamento {
	dinheiro(0),
	cartaoDeb(1),
	cartaoCred(2);
	
	private String metodo;
	private int n;
	
	Pagamento(int n){
		this.n = n;
		
		if( n == 0) {
			metodo = "dinheiro";
		}
		else if( n == 1) {
			metodo = "Cart�o de Debito";
		}
		else {
			metodo = "Cart�o de Cr�dito";
		}
	}
	
	public String getMetodo() {
		return this.metodo;
	}
	
	public int getN() {
		return this.n;
	}
}
