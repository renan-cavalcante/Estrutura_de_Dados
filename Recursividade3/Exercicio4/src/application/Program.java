package application;

import controller.ConverteBinController;

public class Program {

	public static void main(String[] args){
		ConverteBinController controller = new ConverteBinController();
		
		System.out.println(controller.converterBinario(7));
		
	}

}
