package exercicio3.view;

import java.util.Scanner;

import exercicio3.controller.PalidromoController;

public class Main {
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite um palavra");
		palavra = ler.next();
		
		PalidromoController palidromoController = new PalidromoController(palavra);	
		
		if(palidromoController.comparaPalavra()) {
			System.out.println(palavra + " é um palindromo");
		}else {
			System.out.println(palavra + " não é um palindromo");
		}
	}

}
