import characters.*;
import itens.*;

public class RpgTest {
	
	public static void Attack(characters.Character attacker, characters.Character defender, TipoAtaque ataque) {
		if(ataque == TipoAtaque.fisico) {
			defender.recebeDanoFisico(attacker.ataqueFisico());
		}else {
			defender.recebeDanoMagico(attacker.ataqueMagico());
		}
	}
	
	public static void main(String[] args) {
		Weapon arma1 = new Weapon("Espada", 150, 70);
		Weapon arma2 = new Weapon("Rifle", 580, 90);
		
		Armor cap = new Armor("capacete", 800, 48); 
		Armor colete = new Armor("colete", 913, 88);
		
		Mago mago1 = new Mago("Destruidor", 450, 750, 760, 840, 710, 890, cap, arma1);
		characters.Character cara1 = new characters.Character("Ronaldo", 1000, 400, 700, 1000, 650, 1000, colete, arma2);
		
		
		
		System.out.println(mago1.toString());
		System.out.println();
		System.out.println(cara1.toString());
		
		Attack(mago1,cara1,TipoAtaque.fisico);
		
		System.out.println();
		System.out.println(mago1.toString());
		System.out.println();
		System.out.println(cara1.toString());
	}

}
