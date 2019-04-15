import java.util.Date;

public class VendaPrazo {
	private double valor;
	private Date data;
	private Funcionario funcionario; 
	private Cliente cliente; 
	private Pagamento pg; // metodo de pagamento
	private final int TotalParcelas;
	private int nParcelas; // Parcelas restantes
	private double vParcelas; // valor de cada parcela dada a formula
	
	public VendaPrazo(double valor, Funcionario funcionario, Cliente cliente, Pagamento pg, int nParcelas) {
		this.valor = valor;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.pg = pg;
		this.TotalParcelas = nParcelas;
		this.nParcelas = nParcelas;
		data = new Date();
		calcParcela();
	}
	
	private void calcParcela() {
		
		if(pg.getN() == 1 || pg.getN() == 2 )
			this.vParcelas = this.valor *(1 + this.TotalParcelas * 0.025);
		
	}
	
	public void pagarParcela() {
		this.nParcelas -= 1;
	}
	
	public void show() {
		System.out.println("Data : "+data);
		System.out.println("Valor total : "+valor);
		System.out.println("Funcionario : "+funcionario.getNome());
		System.out.println("Cliente : "+cliente.getNome());
		System.out.println("Metodo de pagamento : "+pg.getMetodo());
		System.out.println("total parcelas : "+TotalParcelas);
		System.out.println("Valor de cada parcela : "+vParcelas);
		System.out.println("parcelas restantes : "+nParcelas);
		System.out.println();
	}
	
}
