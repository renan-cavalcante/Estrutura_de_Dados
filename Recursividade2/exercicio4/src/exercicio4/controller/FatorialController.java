package exercicio4.controller;

public class FatorialController {

	public FatorialController() {
	}
	
	public long FatorialDuplo(int n) {
		if(n <= 1) return 1; // quando n for menor ou igual a 1 ele para e retorna 1
		else {
			return n * FatorialDuplo(n-2);// ele chama recursivamente n * metodo com valor n-2
		}
	}

}
