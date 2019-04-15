
public class Exer2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario(11158,"Jose");
		Cliente c1 = new Cliente("1115448","Jamiltoss","Rua daora","9 994842 11");
		VendaPrazo v1 = new VendaPrazo(11885, f1, c1, Pagamento.dinheiro, 12);
		
		v1.show();
		
		v1.pagarParcela();
		
		v1.show();
		
		VendaVista v2 = new VendaVista(15000, f1 , c1, Pagamento.cartaoDeb);
		
		v2.show();
		
	}

}
