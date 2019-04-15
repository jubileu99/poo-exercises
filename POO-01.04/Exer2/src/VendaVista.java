import java.util.Date;

public class VendaVista {
	private double valor;
	private Date data;
	private Funcionario funcionario;
	private Cliente cliente;
	private Pagamento pg;
	
	public VendaVista(double valor, Funcionario funcionario, Cliente cliente, Pagamento pg) {
		this.valor = valor;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.pg = pg;
		data = new Date();
		calcTotal();
	}
	
	private void calcTotal() {
		this.valor -= this.valor*0.05;
	}
	
	
	public void show() {
		System.out.println("Data : "+data);
		System.out.println("Valor total : "+valor);
		System.out.println("Funcionario : "+funcionario.getNome());
		System.out.println("Cliente : "+cliente.getNome());
		System.out.println("Metodo de pagamento : "+pg.getMetodo());
		System.out.println();
	}
	
}
