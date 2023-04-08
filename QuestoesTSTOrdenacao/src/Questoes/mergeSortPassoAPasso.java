package Questoes;

import java.util.Arrays;
import java.util.Scanner;

 class mergeSortPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valoresInt = StringToInt(sc.nextLine().split(" "));
		System.out.println(Arrays.toString(valoresInt));
		mergeSort(valoresInt, 0, valoresInt.length-1);
	}
	
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
	
    public static void mergeSort(int[] v, int left, int right) {
        if(left < right) {
        	int middle = (left + right) / 2;

            System.out.println(Arrays.toString(Arrays.copyOfRange(v, left, middle + 1)));
            mergeSort(v, left, middle);

            System.out.println(Arrays.toString(Arrays.copyOfRange(v, middle + 1, right + 1)));
            mergeSort(v, middle + 1, right);

            merge(v, left, middle, right);

            System.out.println(Arrays.toString(Arrays.copyOfRange(v, left, right + 1)));
        }

    }
	
	public static void merge(int[] v, int left, int middle, int right) {
	    int[] helper = new int[v.length];
	    for (int i = left; i <= right; i++) {
	          helper[i] = v[i];
	        }
		
		int i = left;
		int j = middle + 1;
		int k = left;
		
		while(i <= middle && j <= right) {
			if(helper[i] < helper[j]) {
				v[k] = helper[i];
				k++;
				i++;
			} else {
				v[k] = helper[j];
				k++;
				j++;
			}
		}
		
		while(i <= middle) {
			v[k] = helper[i];
			k++;
			i++;
		}
		
		while(j <= right) {
			v[k] = helper[j];
			k++;
			j++;
		}
		
	
	}
}
