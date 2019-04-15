
public class Produto {
	private int cod;
	private double valor;
	private int qtd;
	private ProdutoTipo tipo;
	
	public Produto(int cod, double valor, int qtd, ProdutoTipo tipo) {
		this.cod = cod;
		this.valor = valor;
		this.qtd = qtd;
		this.tipo = tipo;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public ProdutoTipo getTipo() {
		return tipo;
	}

	public void setTipo(ProdutoTipo tipo) {
		this.tipo = tipo;
	}
	
}
