package exercicio5.controller;

import movel.Pilha;

public class HistoricoController {

	public HistoricoController() {
	}
	
	public void inserirEndereco(Pilha p, String endereco) {
		if(endereco.toLowerCase().startsWith("http://www.") || endereco.toLowerCase().startsWith("https://www.")) {
			String[] confereEndereco = endereco.split("\\.");
			if(confereEndereco.length > 2 && confereEndereco[1].length()>0) {
				p.push(endereco);
				return;
			}
		}
		System.out.println("O endereço inserido não é valido");
	}
	
	public void removerUltimoEndereco(Pilha p) {
		try {
			p.pop();
			System.out.println("Endereço removido");
		}catch(Exception erro) {
			System.err.println("O historico não tem endereço para remover");
		}
	}
	
	public void consultarUltimoEndereco(Pilha p) {
		try {
			System.out.println(p.top());
		}catch(Exception erro) {
			System.out.println("O historico não tem endereço");
		}
	}
	
	public void exibirHistorico(Pilha p) {
		Pilha pilhaAux = p.clonar();
		
		while(!pilhaAux.isEmpty()) {
			try {
				System.out.println(pilhaAux.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
