package controller;

public class InverterStringController {

	public InverterStringController() {
	}
	
	public String inverterString(String texto, int posicao) {
		if(posicao >= texto.length()/2) return texto; // se a posicao for maior ou igual a metade do tamanho do texto, o metodo para e retorna o texto
		
		String comeco = texto.substring(0,posicao);// pega o come�o da string
		String invertido1 = texto.substring(texto.length()-posicao-1,texto.length()-posicao);// pega a letra do fim para inverter com a do come�o
		String meio = texto.substring(posicao+1, texto.length()-posicao-1);// pega o meio da string
		String invertido2 = texto.substring(posicao, posicao+1);// pega a letra do come�o para inverter com a do fim
		String fim = texto.substring(texto.length()-posicao, texto.length());// pega o fim da string
		texto = comeco+invertido1+meio+invertido2+fim; // juntas todas as vari�veis da string
			//texto =  +  ++ +
		return inverterString(texto, posicao+1);// chama o metodo passando o texto com 2 posi��es invertidas, mais a posicao somando 1
	}

}
