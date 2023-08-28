package exercicio4.application;

import exercicio4.controller.MenorZero;

public class Program {

	public static void main(String[] args) {
		MenorZero controller = new MenorZero();
		
		int[] vetor = { 0, -1, 2, 3, -1, 4, 5, 6, 8, -9 };

		System.out.println(controller.quantidadeValorNegativo(vetor, vetor.length - 1, 0));

	}

}
