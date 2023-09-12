package exercicio3.view;

import java.util.Scanner;

import exercicio3.controller.fatController;

public class pilha {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Digite um numero entre 0 e 10");
			numero = ler.nextInt();
		} while (numero > 10 || numero < 0);
		
		fatController controller = new fatController();
		
		System.out.println(controller.calculeFat(numero));

	}
}
