package exemplo.view;

import exemplo.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		try {
			l.addFisrt(1);
			l.addLast(2);
			l.add(10, 1);
			l.addFisrt(0);
			System.out.println(l.get(1));	
			l.add(20, 2);
			System.out.println(l.get(3));
			l.removeFisrt();
			l.removeLast();
			l.remove(1);
			System.out.println(l.get(1));
			System.out.println(l.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
