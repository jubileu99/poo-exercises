
public class VetorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ponto p1 = new Ponto(2, -3);
		Ponto p2 = new Ponto(4, 5);
		Ponto p3 = new Ponto(7,-1);
		Vetor v1 = new Vetor(p2, p2);
		Vetor v2 = new Vetor(p2, p3);
		
		Ponto p = Vetor.somaVetor(v1.getVetor(), v2.getVetor()); 
		
		System.out.println(v1.anguloVetor());
		System.out.println(v2.getMod());
		System.out.println(p.getPosX() + " , " + p.getPosY());
	}

}
