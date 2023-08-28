package controller;

public class SomatoriaN {

	public SomatoriaN() {
	}
	
	public int SomarValores(int n) {
		if(n < 1) { //Quando N for menor que 1 retorna 0
			return 0;
		}
		else {
			return n + SomarValores(n - 1);// A chamada sera o valor de n atual mais o valor de n -1
		}
	}

}
