package Questões;

public class AlgoritmobuscaBinaria {

	public static boolean buscaBinaria(int[] array, int ini, int fim, int k) {
		boolean result = false;
		
		int meio = (ini + fim) / 2;
		
		if(ini >= fim) {
			return false;
		}
		
		if(array[meio] == k) {
			result = true;
			
		} else {
		
		if(k > array[meio]) {
			result = buscaBinaria(array, meio+1, fim, k);
				
		} else {
			result = buscaBinaria(array, ini, meio-1, k);
		}
		}
		
		return result;
	}
}
