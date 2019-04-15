package itens;

public class Armor extends Equipament{
	
	public Armor(String n, int s, int c) {
		super(n,s,c);
		setStrenght(s);
		setName(n);
		setClasse(c);
	}
	
	public void setStrenght(int s) {
		this.strenght = s;
	}
	public void setClasse(int c) {
		this.classe = c;
	}
}
