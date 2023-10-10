package exemplo;

public class Lista<T> {
	No<T> primeiro;
	
	
	public Lista() {
		primeiro = null;
	}

	public boolean isEmpty() {
		if(primeiro == null) {
			return true;
		}
		return false;
		
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No<T> auxiliar = primeiro;
			while( auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
						
			}
		}
		return cont;
	}
	
	private No<T> getNo(int posicao) throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho -1) {
			throw new Exception("Posição invalida");
		}
		int cont = 0;
		No<T> auxiliar = primeiro;
		while(cont < posicao ) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}
	
	public void addFisrt(T valor) {
		No<T> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}
	
	public void addLast(T valor) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		No<T> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = null;
		
		No<T> ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}
	
	public void add(T valor, int posicao) throws Exception {
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho) {
			throw new Exception("Posicao invalida");
		}
		if(posicao == 0) {
			addFisrt(valor);
			return;
		}
		if(posicao == tamanho) {
			addLast(valor);
			return;
		}
		No<T> anterior = getNo(posicao -1);
		No<T> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = anterior.proximo;
		anterior.proximo = elemento;
	}
	
	public void removeFisrt() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		primeiro = primeiro.proximo;
	}
	
	public void removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(tamanho == 1) {
			removeFisrt();
			return;
		}
		No<T> penultimo = getNo(tamanho-2);
		penultimo.proximo=null; 
				
	}
	
	public void remove(int posicao) throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}		
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posicao invalida");
		}
		
		if(posicao == 0) {
			removeFisrt();
			return;
		}
		
		if(posicao == tamanho -1) {
			removeLast();
			return;
		}
		No<T> anterior = getNo(posicao - 1);
		No<T> atual = getNo(posicao);
		anterior.proximo = atual.proximo;
	}
	
	public T get(int posicao) throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}		
		int tamanho = size();
		if(posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posicao invalida");
		}
		No<T> elemento = getNo(posicao);
		return elemento.dado;
	}
	
}
