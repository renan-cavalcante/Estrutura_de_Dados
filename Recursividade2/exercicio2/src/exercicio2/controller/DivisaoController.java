package exercicio2.controller;

public class DivisaoController {

	public DivisaoController() {	
	}
	
	public int RestoDivisao(int dividendo, int divisor) {
		if(dividendo < divisor) return dividendo;// se dividendo for menor que o divisor ele retorna o dividendo
		else return RestoDivisao(dividendo - divisor, divisor);// se n�o ele chama a fun��o passando o dividendo - divisor, mais o divisor
	}

}
