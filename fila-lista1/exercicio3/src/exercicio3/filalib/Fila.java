package exercicio3.filalib;

public class Fila<T> {
	
	No<T> inicio;
	No<T> fim;

	public Fila() {
		inicio = null;
		fim = inicio;
	}
	
	public boolean isEmpty() {
		return(inicio == fim && inicio == null);
	}
	
	public void insert(T dado) {
		No<T> elemento = new No<>();
		elemento.dado = dado;
		elemento.proximo = null;
		
		if(isEmpty()) {
			inicio = elemento;
			fim = elemento;
		}else {
			fim.proximo=elemento;
			fim = elemento;
		}
	}
	
	public T Remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		T dado = inicio.dado;
		if(inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		}else {
			inicio = inicio.proximo;
		}
		return dado;
	}
	
	public void List() throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		No<T> aux = inicio;
		while(aux != null) {
			System.out.print(aux.toString()+" ");
			aux = aux.proximo;
		}
		System.out.println("");
	}
	
	public int size() {
		int cont= 0;
		if (!isEmpty()) {
			No<T> auxiliar = inicio;
			while (auxiliar != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

}
