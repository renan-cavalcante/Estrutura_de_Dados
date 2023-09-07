package exercicio4.controller;

import movel.Pilha;

public class ConverterController {
	private Pilha pilha = new Pilha();

	public ConverterController() {
	}

	public String decToBin(int valor) {
		while (valor > 0) {
			pilha.push(valor % 2);
			valor /= 2;
		}
		
		StringBuilder builder = new StringBuilder();
		while (!pilha.isEmpty()) {
			try {
				builder.append(pilha.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return builder.toString();
	}

}
