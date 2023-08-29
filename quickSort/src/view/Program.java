package view;

import controller.QuickSort;

public class Program {

	public static void main(String[] args) {
		int[] vetor = {50,24, 38 ,64, 12,};
		vetor = QuickSort.quickSort(vetor, 0, vetor.length-1);
		
		for(int i : vetor) {
			System.out.print(i + ",");
		}
	}

}
