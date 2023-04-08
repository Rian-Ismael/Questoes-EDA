package Questoes;

import java.util.Arrays;
import java.util.Scanner;

 class Melhor_Pivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valoresArray = StringToInt(sc.nextLine().split(" "));
		int[] IndicesPivot = StringToInt(sc.nextLine().split(" "));

		partitionMediana(valoresArray, IndicesPivot, 0, valoresArray.length-1);
		
	}
	
	public static void partitionMediana(int[] v, int[] indices, int left, int right) {
		int middle = (left + right)  / 2;
		
		int[] sorted = {v[left], v[middle], v[right]};
		
	    if (sorted[1] < sorted[0]) {
	        swap(sorted, 1, 0);
	    }
	    if (sorted[2] < sorted[1]) {
	        swap(sorted, 1, 2);
	        if (sorted[1] < sorted[0]) {
	            swap(sorted, 0, 1);
	        }
	    }
	    
	     int primeiro = Math.abs(sorted[1] - v[indices[0]]);
	     int segundo = Math.abs(sorted[1] - v[indices[1]]);
	     
	     if(primeiro < segundo) {
	    	 System.out.println(indices[0]);
	     } else if (segundo < primeiro) {
	    	 System.out.println(indices[1]);
	     } else {
	    	 System.out.println(indices[0]);
	     }
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
