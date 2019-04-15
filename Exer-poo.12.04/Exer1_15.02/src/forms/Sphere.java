package forms;

public class Sphere extends Shape{
	private double raio;
	
	public Sphere(double r) {
		super("Sphere");
		this.raio = r;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double area() {
		double calc = 4*Math.PI*Math.pow(this.raio, 2);
		return calc;
	}
	
	public String toString() {
		String frase = super.toString();
		frase += "\nraio: "+getRaio();
		frase += "\nArea: "+area();
		return frase;
	}

	

	

	
	
	
	
}
