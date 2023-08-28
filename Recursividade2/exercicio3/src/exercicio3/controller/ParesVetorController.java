package exercicio3.controller;

public class ParesVetorController {

	public ParesVetorController() {
	}
	
	public int paresExistentes(int[] vetor, int tamanho) {
		if(tamanho < 0) return 0; // se o valor for menor que 0 ele retorna 0
		if(vetor[tamanho] % 2 == 0) {
			return 1 + paresExistentes(vetor, tamanho-1); // se o valor pego do vetor for par ele retorna 1 + a chamada da função com tamanho -1
		}else {
			return  paresExistentes(vetor, tamanho-1);// se o valor pego do vetor for impar ele retorna  a chamada da função com tamanho -1
		}
	}

}
