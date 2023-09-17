package exercicio2;

import movel.Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();	
		pilha.push("W");
		pilha.push("L");
		pilha.push("H");
		pilha.push("B");
		pilha.push("R");
		pilha.push("G");
		pilha.push("J");

		while(!pilha.isEmpty()) {
			try {
				if(pilha.top().equals("R") || pilha.top().equals("W")) {
					System.out.print(pilha.pop()+" ");
				}else {
					pilha.pop();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		pilha.push("L");
		pilha.push("B");
		pilha.push("M");
		pilha.push("G");
		pilha.push("K");
	}

}
