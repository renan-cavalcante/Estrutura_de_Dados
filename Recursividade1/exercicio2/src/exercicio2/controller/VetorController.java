package exercicio2.controller;

public class VetorController {
	public VetorController() {
		
	}
	
	public  int menorValorVetor(int[] vetor, int tamanho, int menorValor) {
		if( vetor[tamanho] < menorValor) {
			menorValor = vetor[tamanho];
		}
		if(tamanho == 0) { // parada quando o tamanho do vetor é igual a zero retornando o menorValor
			return menorValor;
		}else {
			return menorValorVetor(vetor, tamanho-1, menorValor); //a chamada é com o tamanho do vetor -1 para percorrer todo o vetor
		}
		
	}
}
