package movel;

public class Pilha {
	No topo;	
	
	public Pilha() {
		topo = null;
	}
	
	public void push(int valor) {
		No no = new No(valor, topo);
		topo = no;
	}
	
	public boolean isEmpty() {
		return topo == null;
	}
	
	public int pop() throws Exception {
		if(!isEmpty()) {
			int dado = topo.dado;
			topo = topo.no;
			return dado;
		}
		
		throw new Exception("Pilha vazia");
	}
	
	public int size() {
		int tamanho = 0;
		
		if(!isEmpty()) {
			No aux = topo;
			while(aux != null) {
				aux = aux.no;
				tamanho++;
			}
		}
		
		return tamanho;
	}
	
	public int top() throws Exception {
		if(!isEmpty()) {
			int dado = topo.dado;
			return dado;
		}
		
		throw new Exception("Pilha vazia");
	}

}
