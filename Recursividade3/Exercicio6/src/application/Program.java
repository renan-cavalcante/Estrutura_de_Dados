package application;

import controller.SerieController;

public class Program {

	public static void main(String[] args) {
		SerieController controller = new SerieController();
		
		System.out.println(controller.somaSerie(3));

	}

}
