package view;

import java.util.Scanner;

import exercicio3.filalib.Fila;
import exercicio5.controller.PreferenciaController;
import exercicio5.entities.Cliente;

public class Main {

	public static void main(String[] args) {
		Fila<Cliente> prioritaria = new Fila<>();
		Fila<Cliente> fila = new Fila<>();
		int filaCont = 0, prioriCont = 0;
		PreferenciaController preferenciaController = new PreferenciaController();

		try (Scanner ler = new Scanner(System.in)) {
			String opcao;
			do {
				System.out.println(
						"Digite 1 para pegar senha normal, 2 para pegar senha preferencial, 3 para chamar uma pessoa ou 0 para finalizar");
				opcao = ler.nextLine();
				switch (opcao) {
				case "1":
					System.out.println("Digite seu nome");
					preferenciaController.inserir(fila, new Cliente(ler.nextLine(), filaCont));
					filaCont++;
					break;
				case "2":
					System.out.println("Digite seu nome");
					preferenciaController.inserir(prioritaria, new Cliente(ler.nextLine(), prioriCont));
					prioriCont++;
					break;
				case "3":
					preferenciaController.chamado(prioritaria, fila);
					break;
				default:
					break;
				}
			} while (!opcao.equals("0"));
		}

	}

}
