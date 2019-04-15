package model;

public interface Agenda {
	boolean adicionarContato(Contato novoContato);
	boolean removerContato(int identificador);
	Contato consultarContato(int identificador);
	boolean alterarContato(Contato contato);
}
