package exercicio4.application;

import java.util.Scanner;

import exercicio4.controller.FatorialController;

public class Program {

	public static void main(String[] args) {
		FatorialController controller = new FatorialController();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero impar");
		int n = ler.nextInt();
		
		while(n % 2 == 0) {
			System.out.println("Digite um numero impar");
			n = ler.nextInt();			
		}
		
		System.out.println(controller.FatorialDuplo(n));
		
		ler.close();

	}

}
