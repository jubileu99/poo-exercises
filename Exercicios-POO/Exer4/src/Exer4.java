import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exer4 {
	
	public Exer4(){
		try {
			FileReader arq = new FileReader("C:\\Users\\victo\\Documents\\workspace\\workspace-java\\Exercicios-POO\\Exer4\\src\\AT02.txt");
			
			 BufferedReader lerArq = new BufferedReader(arq);
			 
			 String linha = lerArq.readLine();
			 
			 while(linha != null) {
				 System.out.printf("%s\n",linha);
				 linha = lerArq.readLine();
			 }
			arq.close();
		} catch (Exception e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
			          e.getMessage());
		}
		System.out.println();
	}
	
}
