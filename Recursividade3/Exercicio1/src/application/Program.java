package application;

import controller.QuantidadeDigitoController;

public class Program {

	public static void main(String[] args) {
		QuantidadeDigitoController controller = new QuantidadeDigitoController();
		
		System.out.println(controller.digitos(100001));

	}

}
