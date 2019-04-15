package forms;

public class RectangularPrism extends Shape{
	private double altura, largura, comprimento;

	public RectangularPrism(double altura, double largura, double comprimento){
		super("Rectangular prism");
		setAltura(altura);
		setLargura(largura);
		setComprimento(comprimento);
	}

	public double area(){
		double calc = 2*(altura*largura) + 2*(altura*comprimento) + 2*(largura*altura);
		return calc;
	}

	public double getAltura() {
		return altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public String toString(){
		String frase = super.toString();
		frase += "\nAltura: "+getAltura();
		frase += "\nLargura: "+getLargura();
		frase += "\nComprimento: "+getComprimento();
		frase += "\nArea: "+area();

		return frase;
	}
	
}
