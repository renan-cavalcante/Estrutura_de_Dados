package exercicio3.filalib;

public class No<T> {

	T dado;
	No<T> proximo;
	
	@Override
	public String toString() {
		return String.format("[dado=%s]", dado);
	}
	
	
	

}
