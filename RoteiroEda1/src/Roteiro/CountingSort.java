package Roteiro;

public class CountingSort {

	public static void main(String[] args) {
		
	}
	
	public static void sort(int[] arr) {
		if (arr == null || arr.length == 0) {
	        	return;
		}
		
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min] += 1;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
	  
		
		System.out.println(Arrays.toString(output));	
}
	
// Variation (0) //
import java.util.Arrays;
import java.util.Scanner;

class CoutingPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = StringToInt(sc.nextLine().split(" "));
		
		int k = Integer.parseInt(sc.nextLine());

		counting(arr, k);
	    //int min = arr[0];
	    //int max = arr[0];

	    //for (int i = 0; i < arr.length; i++) {
	        //if (arr[i] < min) {
	        	//min = arr[i];
	        //}
	    //}
	    
	    //int range = k - min + 1;
	    //int[] frequencia = new int[range];
	
	    //for(int i = 0; i < arr.length; i++) {
	    	//frequencia[arr[i] - min] += 1;
		//System.out.println(convertToString(frequencia));
	    //}
	    
	    //cumulativa
	    //for(int i = 1; i < frequencia.length; i++) {
	    	///frequencia[i] += frequencia[i-1];
	    //}
	    //System.out.println("Cumulativa do vetor de contagem - " + convertToString(frequencia));
		
	    
	    //int[] ordenando = new int[arr.length];
	    
	    //for(int i = arr.length-1; i >= 0; i--) {
	    	//ordenando[frequencia[arr[i] - min] - 1] = arr[i];
	    	//frequencia[arr[i] - min]--;
	    //}	  
	    //System.out.println(convertToString(frequencia));
		
		//System.out.println(convertToString(ordenando));
		
}
	
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
	
	public static String convertToString(int[] arr) {
		String saida = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length-1) {
				saida += arr[i] + " ";
			} else {
				saida += arr[i];
			}
		}
		
		return saida;
	}
	
	public static void counting(int[] arr, int k) {
		int[] frequencia = new int[k+1];
		
		for(int i = 0; i < arr.length; i++) {
			frequencia[arr[i]] += 1;
			System.out.println(convertToString(frequencia));
		}
		
		//cumulativa
		for(int i = 1; i < frequencia.length; i++) {
			frequencia[i] += frequencia[i-1];
		}
		System.out.println("Cumulativa do vetor de contagem - " + convertToString(frequencia));
		
		int[] ordenando = new int[arr.length];
		
		for(int i = arr.length-1; i >= 0; i--) {
			ordenando[frequencia[arr[i]] - 1] = arr[i];
			frequencia[arr[i]]--;
		}
		
	    System.out.println(convertToString(frequencia));
		
		System.out.println(convertToString(ordenando));
	}
}
