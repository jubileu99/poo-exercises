import java.util.Scanner;

public class Exer2Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Informe dois numeros codificados");
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		Exer2 e1 = new Exer2(num1,num2);
		
		System.out.println(e1.getNumber());
		
		sc.close();
	}

}
