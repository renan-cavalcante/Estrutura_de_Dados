package exercicio2.Aplication;

import exercicio2.controller.VetorController;

public class Program {

	public static void main(String[] args) {
		VetorController controller = new VetorController();
		
		int[] vetor = {0,1,2,3,-1,4,5,6,8,9};
		
		System.out.println(controller.menorValorVetor(vetor, vetor.length-1, vetor[vetor.length-1]));

	}

}
