package characters;

import itens.*;

public class Mago extends Character{

	public Mago(String name, int hp, int mp, int strenght, int concentration, int consistency, int spirit, Armor armor, Weapon weapon) {
		super(name, hp, mp, strenght, concentration, consistency, spirit, armor, weapon);
	}
	public double ataqueMagico() {
		double ataque_magico_mago = weapon.getStrenght() * (1.0 + weapon.getClasse() *0.07 + concentration * 0.0175);
		return ataque_magico_mago;
	}
	
}
