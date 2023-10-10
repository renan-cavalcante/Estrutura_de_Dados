package exercicio3.controller;

import java.util.Stack;

import exemplo.Lista;
import movel.Pilha;

public class ListaController {

	public ListaController() {
	}

	public Lista<Integer> inverterLista(Lista<Integer> lista) {
		Stack<Integer> p = new Stack<>();
		try {
			while (!lista.isEmpty()) {

				p.push(lista.get(0));
				lista.removeFisrt();

			}
			lista.addFisrt(p.pop());;
			while (!p.isEmpty()) {
				lista.addLast(p.pop());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
