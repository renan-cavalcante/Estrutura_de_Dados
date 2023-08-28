package exercicio3.controller;

public class RecursividadeController {
	public RecursividadeController() {	
	}
	
	public int fatorar(int valor) {
		if(valor <= 1) { //A parada é definida qunado o valor fica abaixo ou igual de 1
			return 1;
		}else {
			return valor * fatorar(valor-1); // A chamada da função é o valor atual vezes a chamada da função com o valor -1, 
			//assim quando der 1 ele volta e vai multiplacando com o valor anterior enquanto volta
		}
	}
}
