package Questões;

import java.util.Scanner;

public class SomaDoisElementosInteirosPositivos {
	
	Scanner sc = new Scanner(System.in);
	
	public static int somaDoisElementos(int[] array) {
		return somaElementosRecursivo(array, 0);
	}

	private static int somaElementosRecursivo(int[] array, int indice) {
		int result = 0;
		if(indice == array.length || indice == 2) {
			
		} else {
			result = array[indice] + somaElementosRecursivo(array, indice+1);
		}
		return result;
	}
	
}
