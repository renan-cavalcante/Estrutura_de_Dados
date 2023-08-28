package controller;

public class QuantidadeDigitoController {

	public QuantidadeDigitoController() {
	}
	
	public int digitos(int valor) {
		if(valor < 10) return 1; // se o valor for menor que 10 ele para e retorna 1
		else return 1 + digitos(valor / 10);// se não ele chama o metodo com o valor dividido por 10, somando 1 ao metodo
	}

}
