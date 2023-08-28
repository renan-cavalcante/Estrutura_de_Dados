package application;

import controller.FibonacciController;

public class Program {

	public static void main(String[] args) {
		FibonacciController controller = new FibonacciController();
		
		System.out.println(controller.fibonacciN(20));

	}

}
