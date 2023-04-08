package Questoes;

import java.util.Scanner;

class Down_N {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valoresInt = StringToInt(sc.nextLine().split(" "));
		
		int nElementos = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < valoresInt.length; i++) {
			int index_menor = i;
			for(int j = i + 1; j < valoresInt.length; j++) {
				if(valoresInt[index_menor] >  valoresInt[j]) {
					index_menor = j;
				}
			}
			
			int aux = valoresInt[i];
			valoresInt[i] = valoresInt[index_menor];
			valoresInt[index_menor] = aux;
		}
		
		String saida = "";
		for(int i = 0; i < nElementos; i++) {
			if(i == nElementos-1) {
				saida += valoresInt[i];
			} else {
			saida += valoresInt[i] + " ";
			}
		}
		System.out.println(saida);
		
	}
	
	
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
	
}