package exercicio5.controller;

public class mdcController {

	public mdcController() {
	}
	
	public int mdc(int valor1, int valor2) {
		
		if(valor1 == valor2) return valor1; // retorna o valor quandos ambos são iguais
		
		if(valor1 > valor2) {
			return mdc(valor1 - valor2, valor2); // chama a função com o valor1 - valor2 mais o valor2, se o valor1 for maior que o valor2
		}else {
			return mdc(valor2, valor1);// chama os valores invertodos se valor1 for menor que valor2
		}
	}

}
