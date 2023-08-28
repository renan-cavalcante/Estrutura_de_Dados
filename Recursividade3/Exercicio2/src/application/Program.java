package application;

import controller.QuantidadeNumeroController;

public class Program {

	public static void main(String[] args) {
		QuantidadeNumeroController controller = new QuantidadeNumeroController();
		
		System.out.println(controller.QuantidadeVezes(10, 1));
	}
}
