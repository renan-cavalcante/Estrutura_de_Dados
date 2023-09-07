package controller;

import java.util.List;

import com.libsrenan.ordenacao.order;

public class TempoController {

	public TempoController() {
			
		}
	
	public double bubble(List<Integer> lista) {
		double inicio = System.nanoTime();
		order.bubbleSort(lista);
		double fim = System.nanoTime();
		
		return (fim -inicio) / Math.pow(10, 9);
	}
	
	public double merge(List<Integer> lista,int ini,int f) {
		double inicio = System.nanoTime();
		order.mergeSort(lista, ini, f);
		double fim = System.nanoTime();
		
		return (fim -inicio) / Math.pow(10, 9);
	}
	
	public double quick(List<Integer> lista,int ini,int f) {
		double inicio = System.nanoTime();
		order.quickSort(lista, ini, f);
		double fim = System.nanoTime();
		
		return (fim -inicio ) / Math.pow(10, 9);
	}
	

}
