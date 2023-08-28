package exercicio2.application;

import exercicio2.controller.DivisaoController;

public class Program {

	public static void main(String[] args) {
		DivisaoController controller = new DivisaoController();
		
		System.out.println(controller.RestoDivisao(11, 7));

	}

}
