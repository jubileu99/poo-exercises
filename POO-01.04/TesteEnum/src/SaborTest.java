
public class SaborTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long inicio = System.currentTimeMillis();
		
		System.out.println(Sabor.DOCE.getSabor());
		
		for(Sabor s : Sabor.values()) {
			System.out.println(s.name());
		}
		
		System.out.println("Tempo : " +(System.currentTimeMillis() - inicio));
		
	}

}
