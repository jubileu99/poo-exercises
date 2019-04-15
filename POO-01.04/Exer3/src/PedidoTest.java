public class PedidoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto(100, 178, 12, ProdutoTipo.lanche);
		Produto p2 = new Produto(112, 11, 6, ProdutoTipo.bebida);
		Produto p3 = new Produto(198, 178, 4, ProdutoTipo.lanche);
		Produto p4 = new Produto(110, 178, 19, ProdutoTipo.lanche);
		Produto p5 = new Produto(155, 178, 11, ProdutoTipo.lanche);
		Produto p6 = new Produto(165, 178, 2, ProdutoTipo.bebida);
		Produto p7 = new Produto(199, 178, 31, ProdutoTipo.lanchePrato);
		Produto p8 = new Produto(015, 178, 12, ProdutoTipo.lanche);
		Produto p9 = new Produto(166, 178, 33, ProdutoTipo.lanche);
		Produto p10 = new Produto(177, 178, 6, ProdutoTipo.lanchePrato);
		
		Pedido num1 = new Pedido("Felps", 11, p1);
		num1.Display();
		
		num1.addProduto(p2);
		num1.Display();
		
		num1.addProduto(p7);
		num1.Display();
		
	}

}
