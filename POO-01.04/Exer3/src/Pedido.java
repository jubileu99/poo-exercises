import java.util.ArrayList;

public class Pedido {
	private String nome;
	private int nMesa;
	private ArrayList<Produto> produtos;
	
	public Pedido(String nome, int nrMesa, Produto p) {
		this.nome = nome;
		this.nMesa = nrMesa;
		iniciar();
		addProduto(p);
	}
	
	private void iniciar() {
		produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto p) {
		produtos.add(p);
	}
	
	public double fecharPedido() {
		double total = 0;
		for(Produto p : produtos) {
			if(p.getTipo() == ProdutoTipo.lanchePrato) {
				total += p.getValor() + 0.5;
			}else {
				total += p.getValor();
			}
				
		}
		return total;
	}
	
	public void Display() {
		System.out.println("Nome : "+this.nome);
		System.out.println("Num mesa : "+this.nMesa);
		System.out.println("Total : "+fecharPedido());
		System.out.println();
	}
	
}
