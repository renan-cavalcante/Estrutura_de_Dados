package controller;

public class FibonacciController {

	public FibonacciController() {
		// TODO Auto-generated constructor stub
	}
	
	public int fibonacciN(int valor) {
		if(valor == 1 || valor == 2) { // se o valor for igual a 1 ou 2 ele retorna 1
			return 1;
		}
		
		return fibonacciN(valor-1) + fibonacciN(valor-2);// A chamada é a soma do metodo com valor -1 mais o metodo com valor -2
	}

}
