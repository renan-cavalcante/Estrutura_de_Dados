package exercicio3.controller;

import movel.Pilha;

public class fatController {
	Pilha p = new Pilha();
	
	public fatController() {
	}
	
	public int calculeFat(int valor) {
		while(valor > 1) {
			p.push(valor);
			valor -=1;
		}
		
		while(!p.isEmpty()) {
			try {
				valor *= p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return valor;
	}

}
