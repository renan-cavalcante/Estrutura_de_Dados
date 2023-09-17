package exercicio3.controller;

import movel.Pilha;

public class PalidromoController {

	private Pilha pilha = new Pilha();
	private Pilha pilhaInvertida = new Pilha();
	
	
	public PalidromoController(String palavra) {
		carregarPilha(palavra.toCharArray());
		invertePalavra();
	}
	
	private void carregarPilha(char[] palavras) {
		for(char c : palavras) {
			pilha.push(c+"");
		}
	}
	
	private void invertePalavra() {
		Pilha pilhaAux = pilha.clonar();// metodo clonar chama o construtor  Pilha(topo) passando o topo da pilha a se clonada como argumento
		while(!pilhaAux.isEmpty()) {
			try {
				pilhaInvertida.push(pilhaAux.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public boolean comparaPalavra() {
		
		while(!pilha.isEmpty()|| !pilhaInvertida.isEmpty()) {
			try {
				if(!pilha.pop().equals(pilhaInvertida.pop())) {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
