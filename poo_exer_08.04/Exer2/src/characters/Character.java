package characters;

import itens.*;

public class Character {
	protected String name;
	protected int hp;
	protected int mp;
	protected int strenght;
	protected int concentration;
	protected int consistency;
	protected int spirit;
	protected Armor armor;
	protected Weapon weapon;
	
	public Character(String name, int hp, int mp, int strenght, int concentration,
	int consistency, int spirit, Armor armor, Weapon weapon) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.strenght = strenght;
		this.concentration = concentration;
		this.consistency = consistency;
		this.spirit = spirit;
		equipArmor(armor);
		equipWeapon(weapon);
	}
	public double ataqueFisico() {
		double ataque_fisico = weapon.getStrenght() * (1.0 + weapon.getClasse() * 0.05 + strenght * 0.0125);
		return ataque_fisico;
	}
	public double ataqueMagico() {
		double ataque_magico;
		if(mp >= 5) {
			ataque_magico = weapon.getStrenght() * (1.0+ weapon.getClasse() * 0.05 + concentration * 0.0125);
			mp -= 5;
		}else
			ataque_magico = 0;
			
		return ataque_magico;
	}
	public void recebeDanoFisico(double dano) {
		double dano_fisico = dano *(1.0 - weapon.getClasse() * 0.05 - consistency * 0.005);
		this.hp -= dano_fisico;
	}
	public void recebeDanoMagico(double dano) {
		double dano_magico = dano * (1.0 - armor.getClasse() * 0.03 - spirit * 0.015);
		this.hp -= dano_magico;
	}
	public String toString() {
		String frase = "Nome: "+this.name;
		frase += "\nhp atual: "+this.hp;
		frase += "\nmp: " +this.mp;
		frase += "\nstrenght: "+this.strenght;
		frase += "\nconcentration: "+this.concentration;
		frase += "\nconsistency: "+this.consistency;
		frase += "\nspirit: "+this.spirit;
		frase += "\nweapon: "+weapon.getName();
		frase += "\nweapon strenght: "+weapon.getStrenght();
		frase += "\nweapon class: "+weapon.getClasse();
		frase += "\narmor: "+armor.getName();
		frase += "\narmor strenght: "+armor.getStrenght();
		frase += "\narmor class: "+armor.getClasse();
		
		return frase;
		
	}
	public void equipArmor(Armor armor) {
		this.armor = armor;
	}
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
