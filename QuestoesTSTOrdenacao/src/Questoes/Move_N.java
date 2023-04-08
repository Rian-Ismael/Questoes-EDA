package Questoes;

import java.util.Arrays;
import java.util.Scanner;

class Move_N {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valoresInt = StringToInt(sc.nextLine().split(" "));
		
		
		for(int i = 1; i < valoresInt.length; i++) {
			int j = i;
			while(j > 0 && valoresInt[j] < valoresInt[j-1]) {
				int aux = valoresInt[j];
				valoresInt[j] = valoresInt[j-1];
				valoresInt[j-1] = aux;
				j--;
				System.out.println(Arrays.toString(valoresInt));
			}
		}
		
	}
	
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
}
