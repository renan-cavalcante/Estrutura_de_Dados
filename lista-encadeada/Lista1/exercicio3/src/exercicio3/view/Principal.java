package exercicio3.view;

import exemplo.Lista;
import exercicio3.controller.ListaController;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		l.addFisrt(3);
		try {
			l.addLast(5);
			l.addLast(18);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(13);
			l.addLast(4);
			l.addLast(16);

			
			int tamanho = l.size();
			System.out.println("Lista original");
			for (int i = 0; i < tamanho; i++) {
				System.out.print(l.get(i) + ", ");
			}
			ListaController lc = new ListaController();
			lc.inverterLista(l);
			System.out.println();
			System.out.println("Lista invertida");
			for (int i = 0; i < tamanho; i++) {
				System.out.print(l.get(i) + ", ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
