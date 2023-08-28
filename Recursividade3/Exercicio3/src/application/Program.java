package application;

import controller.InverterStringController;

public class Program {

	public static void main(String[] args) {
		InverterStringController controller = new InverterStringController();
		
		System.out.println(controller.inverterString("teste", 0));

	}

}
