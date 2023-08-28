package exercicio3.apllication;

import exercicio3.controller.ParesVetorController;

public class Program {

	public static void main(String[] args) {
		int[] vetor = {4,6,8,7,5,2,9,1};
		
		ParesVetorController controller = new ParesVetorController();
		System.out.println(controller.paresExistentes(vetor, vetor.length-1));
	}
	
	

}
