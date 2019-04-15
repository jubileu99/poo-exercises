package itens;

public class Equipament {
	protected String name;
	protected int strenght;
	protected int classe; /* class é palavra exclusiva */ 
	
	public Equipament(String n, int s, int c) {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getStrenght() {
		return this.strenght;
	}
	public int getClasse() {
		return this.classe;
	}
}
