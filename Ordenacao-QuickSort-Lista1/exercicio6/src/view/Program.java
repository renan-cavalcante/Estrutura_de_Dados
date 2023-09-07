package view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import controller.TempoController;

public class Program {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		TempoController tempoController = new TempoController();
		
		for (int i = 0; i < 1500; i++) {
			lista.add((int) Math.random() * 1501);
		}
		
		List<Integer> copia1 = lista.stream().collect(Collectors.toList());
		List<Integer> copia2 = lista.stream().collect(Collectors.toList());
		
		System.out.println(tempoController.bubble(lista)+".s");
		System.out.println(tempoController.merge(copia1, 0, copia1.size()-1)+".s");
		System.out.printf("%.10f %s\n",tempoController.quick(copia2,0, copia2.size()-1),".s");
		
	}

}
