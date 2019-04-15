package itens;

public class Weapon extends Equipament{
	public Weapon(String n, int s, int c) {
		super(n,s,c);
		setStrenght(s);
		setName(n);
		setClasse(c);
	}
	
	public void setStrenght(int s) {
		if(s > 0 && s < 1000) 
			this.strenght = s;
		else 
			System.err.println("Erro ao setStrenght");
	}
	public void setClasse(int c) {
		if(c >= 0 && c <= 100)
			this.classe = c;
		else
			System.err.println("Erro ao setClasse");
	}
}
