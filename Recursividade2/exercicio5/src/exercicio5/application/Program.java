package exercicio5.application;

import exercicio5.controller.mdcController;

public class Program {

	public static void main(String[] args) {
		mdcController controller = new mdcController();
		
		System.out.println(controller.mdc(20, 25));
	}
}
