package model;

public class Contato {
	private int id;
	private final String name;
	private String adress;
	private String email;
	private String tell;
	private String whatsapp;
	
	public Contato(String name, String adress, int identify, String tell) {
		this.name = name;
		this.adress = adress;
		setId(identify);
		setTell(tell);
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		if(id > 0)
			this.id = id;
		else
			System.err.println("Informe um Identificador maior que zero.");
	}
	
	public void setTell(String tell) { // xxxx-xxxx ou xxxxx-xxxx
		if(tell.length() > 9 || tell.length() > 10) 
			if(tell.indexOf("-") == 4 || tell.indexOf("-") == 5)
				this.tell = tell;
			else
				System.err.println("Telefone inválido!");
		else
			System.err.println("Telefone inválido!");
		
	}
	
	public void setEmail(String email) {
		if(email.isEmpty() || (email.indexOf(".") != -1 && email.indexOf("@") != -1)) {
			this.email = email;
		}else {
			System.err.println("Email inválido!");
		}
	}
	
	public String toString() {
		String frase = "Nome: "+this.name;
		frase += "\nTel "+this.tell;
		frase += "\nAdress "+this.adress;
		return frase;
	}
	
}
