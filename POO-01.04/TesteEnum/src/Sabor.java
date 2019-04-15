public enum Sabor {
	DOCE(1),
	SALGADO(0);
	
	private int valor;
	
	Sabor(int valor){
		this.valor = valor;
	}
	
	public String getSabor() {
		if(valor == 1) 
			return "Sabor doce";
		else 
			return "Sabor Salgado";
	}
	
}
