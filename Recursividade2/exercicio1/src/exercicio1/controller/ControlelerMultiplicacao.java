package exercicio1.controller;

public class ControlelerMultiplicacao {

	public ControlelerMultiplicacao() {
	}
	
	public int Multiplicar(int valor1, int valor2) {
		
		if(valor1 <= 1) return 0;// se o valor1 for menor ou igual a 1 ele retorna 0
		else return valor2 + Multiplicar(valor1-1, valor2);// se não ele retorna valor2 + chamada de multiplicar com valor1-1, mais valor2
	}

}
