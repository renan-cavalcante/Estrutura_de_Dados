package view;

import movel.Pilha;

public class program {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		
		try {
			System.out.println(pilha.pop());
			System.out.println();
			System.out.println(pilha.size());
			System.out.println(pilha.top());
			System.out.println(pilha.top());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
	}
	
}
