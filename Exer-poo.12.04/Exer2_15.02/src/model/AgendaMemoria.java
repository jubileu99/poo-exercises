package model;

import java.util.ArrayList;

public class AgendaMemoria implements Agenda{
	private ArrayList<Contato> agenda;
	private int n;
	
	public AgendaMemoria(int n) {
		agenda = new ArrayList<Contato>();
	}
	
	public boolean adicionarContato(Contato novoContato) {
		if(agenda.size() < n) {
			agenda.add(novoContato);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removerContato(int identificador) {
		int rm = 0; // saber se o valor foi removido.
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getId() == identificador) {
				agenda.remove(i);
				rm = 1;
			}
		}
		return (rm == 1) ? true : false;
	}
	
	public Contato consultarContato(int identificador) {
		Contato found = null;
		for(Contato i : agenda) {
			if(i.getId() == identificador) {
				return i;
			}
		}
		return found;
	}
	
	public boolean alterarContato(Contato contato) {
		int alt = 0; // saber se o valor foi alterado.
		for(int i = 0; i < agenda.size(); i++) {
			if(contato.getName().equals(agenda.get(i).getName())) {
				agenda.set(i, contato);
				alt = 1;
			}
		}
		return (alt == 1) ? true : false;
	}
	
	public void limparContatos() {
		agenda.removeAll(agenda);
	}
	
	public Contato consultarNome(String nome) {
		Contato cont = null;
		
		for(Contato i : agenda) {
			if(i.getName().equals(nome)) {
				cont = i;
			}
		}
		return cont;
	}
}
