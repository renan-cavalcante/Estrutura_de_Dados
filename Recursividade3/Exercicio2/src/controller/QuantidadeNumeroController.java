package controller;

public class QuantidadeNumeroController {

	public QuantidadeNumeroController() {
	}

	public int QuantidadeVezes(int valor1, int valor2) {
		if (valor1 <= 0) { // se valor1 for menor ou igual a zero o metodo para
			return 0;
		}
		if (valor1 % 10 == valor2) {
			return 1 + QuantidadeVezes(valor1 / 10, valor2); //se o resto do valor1 / 10 for igual a valor2, o metodo é chamado passando o valor1 divido por 10, e o valor2, somando ao metodo + 1
		} else {
			return QuantidadeVezes(valor1 / 10, valor2); //se o resto do valor1 / 10 for diferente do valor2, o metodo é chamado passando o valor1 divido por 10, e o valor2
		}

	}

}
