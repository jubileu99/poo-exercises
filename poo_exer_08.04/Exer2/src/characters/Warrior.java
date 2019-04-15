package characters;

import itens.*;

public class Warrior extends Character{
	private int weaponSkill;
	
	public Warrior(String name, int hp, int mp, int strenght, int concentration, int consistency, int spirit, Armor armor, Weapon weapon) {
		super(name, hp, mp, strenght, concentration, consistency, spirit, armor, weapon);
	}
	
	public double ataqueFisico(){
		double ataque_fisico_guerreiro = weapon.getStrenght() * (1.0 + weapon.getClasse() * 0.06 + strenght * 0.02);
		return ataque_fisico_guerreiro;
	}
	public void recebeDanoFisico(double dano) {
		double dano_fisico_guerreiro = dano * (1.0 - armor.getClasse() * 0.05 - consistency * 0.008);
		hp -= dano_fisico_guerreiro;
	}
}
