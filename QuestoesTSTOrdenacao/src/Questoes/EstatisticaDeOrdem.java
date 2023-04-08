package Questoes;

import java.util.Scanner;

 class EstatisticaDeOrdem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valores = StringToInt(sc.nextLine().split(" "));
		
		int cont = 1;
		for(int i = 1; i < valores.length; i++) {
			if (valores[i] < valores[0]) {
				cont++;
			}
		}
		System.out.println(cont);
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
