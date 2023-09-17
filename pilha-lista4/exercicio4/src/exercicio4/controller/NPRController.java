package exercicio4.controller;

import movel.Pilha;

public class NPRController {

	private Pilha pilha;
	
	public NPRController() {
		pilha = new Pilha();
	}

	public void insereValor(int valor) {
		pilha.push(valor);
	}
	
	public int npr(String op) throws Exception, IllegalArgumentException {
		int valor1 = pilha.pop();
		int valor2 = pilha.pop();
		int resul;
		switch (op) {
			case "+":
				resul = valor2 + valor1;
				break;
			case "-":
				resul = valor2 - valor1;
				break;
			case "*":
				resul = valor2 * valor1;
				break;
			case "/":
				if(valor1 == 0) {
					throw new IllegalArgumentException("Não é possivel dividir por 0");
					
				}else {
					resul = valor2 / valor1;
				}
				break;
			default:
				throw new IllegalArgumentException("Operador invalido");
				
		}
		pilha.push(resul);
		return pilha.top();
	}
	
	public int getPilhaSize() {
		return pilha.size();
	}
}
