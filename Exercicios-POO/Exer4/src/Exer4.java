import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exer4 {
	
	private String dir;
	private int TotalPontos = 0;
	
	public Exer4(String dir){
		this.dir = dir;
		getDados();
	}
	
	private void getDados(){

		String linha = "";
		
		try {
			FileInputStream arquivo = new FileInputStream(dir);
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader reader =  new BufferedReader(input);
			
			while((linha = reader.readLine()) != null) {
				String[] dados = linha.split(";");
				
				
				if(dados[0].equals("Klingon") || dados[3].equals("Klingon")) {
					if(dados[0].equals("Klingon")) {
						
						if(Integer.parseInt(dados[1]) > Integer.parseInt(dados[2])) {
							TotalPontos += 2;
						}else if(Integer.parseInt(dados[1]) < Integer.parseInt(dados[2])){
							TotalPontos -= 1;
						}
						
					}else {
						if(Integer.parseInt(dados[2]) > Integer.parseInt(dados[1])) {
							TotalPontos += 2;
						}else if(Integer.parseInt(dados[2]) < Integer.parseInt(dados[1])){
							TotalPontos -= 1;
						}
					}
						
					System.out.println(dados[0] + " : " + dados[1] + " x " + dados[2] + " : " + dados[3]);
				}
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getTotalPontos() {
		return this.TotalPontos;
	}
	
	public void AddMatch(String t1, int p1, String t2, int p2) {
		String linha = (t1 + ";" + p1 + ";" + p2 + ";" + t2);
		
		try {
			File arquivo = new File(dir);
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write(linha);
			bw.flush();
			bw.close();
			getDados();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
