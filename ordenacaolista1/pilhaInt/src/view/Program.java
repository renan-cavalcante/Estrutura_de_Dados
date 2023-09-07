package view;

import java.util.Arrays;
import java.util.List;

import com.libsrenan.ordenacao.order;

public class Program {

	public static void main(String[] args) {
		Integer[] vetor1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		Integer[] vetor2 = { 44, 43, 42, 41, 40, 39, 38 };

		List<Integer> lista1 = Arrays.asList(vetor1);
		List<Integer> lista2 = Arrays.asList(vetor2);

		System.out.println("Exercicio 1");

		System.out.println("Bubble Sort");
		order.bubbleSort(lista1);
		for (Integer i : lista1) {
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Merge Sort");
		lista1 = Arrays.asList(vetor1);
		order.mergeSort(lista1, 0, lista1.size() - 1);
		for (Integer i : lista1) {
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Exercicio 2");

		System.out.println("Bubble Sort");
		order.bubbleSort(lista2);
		for (Integer i : lista2) {
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Merge Sort");
		lista2 = Arrays.asList(vetor2);
		order.quickSort(lista2, 0, lista2.size() - 1);
		for (Integer i : lista2) {
			System.out.print(i + ", ");
		}
		
		
		

	}

}
