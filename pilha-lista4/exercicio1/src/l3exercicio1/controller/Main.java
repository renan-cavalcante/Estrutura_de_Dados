package l3exercicio1.controller;

import java.util.Arrays;
import java.util.List;

import movel.Pilha;

public class Main {
		public static void main(String[] args) {
		List<Integer> vetor = Arrays.asList(0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,-5);
		Pilha pilhaInt = new Pilha();
		
		for(Integer i : vetor) {
			if(i >= 0) {
				pilhaInt.push(i);
			}else {
				
				try {
					int soma = pilhaInt.pop() + pilhaInt.pop();
					pilhaInt.push(i);
					pilhaInt.push(soma);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		System.out.println("A pilha possui "+pilhaInt.size()+" valores");
	}

}
