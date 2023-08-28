package exercicio5.controller;

public class SomatoriaController {

	public SomatoriaController() {
		// TODO Auto-generated constructor stub
	}
	
	public Double Somatoria(int valor) {
		if(valor <= 1) { // A condição de para é quando o valor for menor ou igual a 1, já que devese fazer a somatoria de 1 ao valor
			return 1.0;
		}else {
			return  (1/(double)valor) + Somatoria(valor - 1); //A chamada da recursiva é a recursiva com o valor diminuindo em 1, mais 1 dividido pelo valor atual
		}
	}

}
