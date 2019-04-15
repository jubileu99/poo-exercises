
public class Vetor {

	private Ponto p1,p2,vetor;

	private double mod;
	
	public Vetor(Ponto p1, Ponto p2) {
		
		this.p1 = p1;
		this.p2 = p2;
		this.vetor = new Ponto(Math.abs(p2.getPosX() + p1.getPosX()),Math.abs(p2.getPosY() + p1.getPosY()));
		CalcMod();
	}
	
	private void CalcMod() {
		this.mod = p1.distanciaPontos(this.p2);
	}
	
	public double getMod() {
		return this.mod;
	}
	
	public Ponto getVetor() {
		return this.vetor;
	}
	
	public static Ponto somaVetor(Ponto v1, Ponto v2) {
		Ponto vSoma = new Ponto( v1.getPosX() + v2.getPosX(), v1.getPosY() + v2.getPosY());
		return vSoma;
	}
	
	public double anguloVetor() {
		double angulo = Math.acos(vetor.getPosX()/(Math.sqrt(Math.pow(vetor.getPosX(),2)+Math.pow(vetor.getPosY(),2))));
		return angulo*180/Math.PI;
	}
	
}
