package exercicio5.controller;

import exercicio3.filalib.Fila;
import exercicio5.entities.Cliente;

public class PreferenciaController {
	private int contadorPrioritario = 0;

	public PreferenciaController() {
	}
	
	public void inserir(Fila<Cliente> fila, Cliente cliente) {
		System.out.println(cliente.getNome()+" Sua senha é: "+ cliente.getNumero());
		fila.insert(cliente);
	}

	public void remover(Fila<Cliente> fila) {
		if(!fila.isEmpty()) {
			try {
				System.out.println(fila.Remove().getNumero());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Fim das filas");
		}
	}
	
	public void chamado(Fila<Cliente> prioritario, Fila<Cliente> fila) {
		if(contadorPrioritario >= 3 || prioritario.isEmpty()) {
			contadorPrioritario = 0;
			System.out.print("F");
			remover(fila);
		}else {
			System.out.print("P");
			remover(prioritario);
			contadorPrioritario++;
		}
	
	}
}
