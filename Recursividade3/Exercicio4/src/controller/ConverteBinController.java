package controller;

public class ConverteBinController {

	public ConverteBinController() {
	}
	
	public String converterBinario(int valor) {
		if(valor / 2 <= 0) return 1+"";
		
		if(valor%2 == 0) {
			return converterBinario(valor/2)+0;
		}
		return  converterBinario(valor/2)+1;
		
	}

}
