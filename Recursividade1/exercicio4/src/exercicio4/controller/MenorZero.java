package exercicio4.controller;

public class MenorZero {

	public MenorZero() {
	}
	
	public int quantidadeValorNegativo(int[] vetor, int tamanho, int contadorNegativos) {
		if(vetor[tamanho] < 0) { // Se o valor atual do vetor for negativo, é adicionado +1 ao contador
			contadorNegativos++;
		}
		if(tamanho <= 0) { // se o tamanho do vetor for menoor ou igual a zero, a recursiva para e retorna o contador
			return contadorNegativos;
		}else {
			return quantidadeValorNegativo(vetor, tamanho-1, contadorNegativos); // É passada para a recursiva o vetor, o tamnho diminuindo 1 e o contador
		}
	}

}
