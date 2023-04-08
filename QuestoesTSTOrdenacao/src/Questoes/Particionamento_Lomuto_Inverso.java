package Questoes;

import java.util.Arrays;
import java.util.Scanner;

 class Particionamento_Lomuto_Inverso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		if(!input.isEmpty()) {
		    String[] valoresString = input.split(" ");
		    int[] valores = StringToInt(valoresString);
		    partition(valores, 0, valores.length-1);
		    System.out.println(Arrays.toString(valores));
		}
	}
	
	public static void partition(int[] v, int left, int right) {
		int pivot = v[right];
		int k = right;
		
		for(int i = right-1; i >= left; i--) {
			if(pivot <= v[i]) {
				k--;
				swap(v, i, k);
				System.out.println(Arrays.toString(v));

			}
		}
	
		swap(v, k, right);
		System.out.println(Arrays.toString(v));

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
