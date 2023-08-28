package controller;

public class SerieController {

	public SerieController() {
		// TODO Auto-generated constructor stub
	}
	
	public double somaSerie(int n) {
		if(n <= 1) { // quando n for menor ou igual a 1 ele para
			return 1;
		}
		
		return  somaSerie(n-1) + (1 / (double)fatorial(n)); // a chamada é o metodo somaSerie com valor n-1, somado a 1 / pelo metodo fatorial passando o valor n
	}
	
	public int fatorial(int n) {
		if ( n <= 1) { // quando n for menor ou igual a 1 ele para
			return 1;
		}
		
		return fatorial(n-1) * n; // o metodo chama ele mesmo com valor n-1 e depois multiplica o resultado por n
	}

}
