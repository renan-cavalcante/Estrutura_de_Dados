package exercicio5.view;

import java.util.Scanner;

import exercicio5.controller.HistoricoController;
import movel.Pilha;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		HistoricoController controller = new HistoricoController();
		
		try(Scanner ler = new Scanner(System.in)) {
			String op;
			do {
				
				System.out.println("Digite\n1 - inserir endereço\n"
						+ "2 - remover ultimo endereço\n"
						+ "3 - consultar ultimo endereço\n"
						+ "4 - exibir o historico\n"
						+ "fim - finalizar o programa\n");
				op = ler.next();

				switch (op) {
				case "1":
					System.out.println("Digite o enreço");
					controller.inserirEndereco(pilha, ler.next());
					break;
				case "2":
					controller.removerUltimoEndereco(pilha);
					break;
				case "3":
					controller.consultarUltimoEndereco(pilha);
					break;
				case "4":
					controller.exibirHistorico(pilha);
				case "fim":
					break;
				default:
				System.out.println("Opção invalida");
				}
				
			}while(!op.equals("fim"));
		}
		
		
		controller.inserirEndereco(pilha, "http://www..com");
	}

}
