package Questoes;

import java.util.Arrays;
import java.util.Scanner;

 class quickSortPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valoresInt = StringToInt(sc.nextLine().split(" "));
		
		quickSort(valoresInt, 0, valoresInt.length-1);
	}
	
	public static void quickSort(int[] v, int left, int right) {
		if(left < right) {
			int indice_pivot = partition(v, left, right);
			System.out.println(forString(v));
			quickSort(v, left, indice_pivot-1);
			quickSort(v, indice_pivot+1, right);
		}
	}
	
	public static String forString(int[] v) {
		String saida = "";
		
		for(int i = 0; i < v.length; i++) {
			if(i != v.length-1) {
				
			saida += Integer.toString(v[i]) + " ";
		} else {
			saida += Integer.toString(v[i]);
		}
	}
		return saida;
}
	
	
	public static int partition(int[] v, int left, int right) {
		int pivot = v[left];
		int k = left;
		
		for(int i = left+1; i <= right; i++) {
			if(v[i] <= pivot) {
				k++;
				swap(v, k, i);
			}
		}
		swap(v, left, k);
		return k;
	}
	
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
	
	private  static  void swap(int[] values, int i, int j) {
		int aux = values[i];
		values[i] = values[j];
		values[j] = aux;
	}
}
