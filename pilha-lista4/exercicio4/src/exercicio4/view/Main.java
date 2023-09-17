package exercicio4.view;

import java.util.Scanner;

import exercicio4.controller.NPRController;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("-Digite um numero para adiciona a pilha\n-(+,-,/,*) para fazer uma opção\n -fim para finalizar o programa");
		String opcao;
		NPRController controller = new NPRController();
		
		do {
			opcao = ler.next();
			
			try {
				int valor = Integer.parseInt(opcao);
				controller.insereValor(valor);
			}catch(Exception e1){
				try {
					if(controller.getPilhaSize() > 1) {
						System.out.println(controller.npr(opcao));
					}else {
						System.out.println("Não a numeros suficientes na pilha para fazer a operação");
					}
					
				}catch(IllegalArgumentException e2 ) {
					System.err.println(e2.getMessage());
				}catch(Exception e3) {
					System.err.println(e3.getMessage());
				}
			}
			
			
		}while(!opcao.equals("fim"));

	}

}
