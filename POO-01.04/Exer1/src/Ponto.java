public class Ponto {
	
	private double x,y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getPosX() {
		return this.x;
	}
	
	public double getPosY() {
		return this.y;
	}
	
	public double distanciaPontos(Ponto p2) {
		double dist = Math.sqrt(Math.pow(p2.getPosX() - getPosX(),2) + Math.pow(p2.getPosY() - getPosY(),2));
		return dist;
	}
	
}
