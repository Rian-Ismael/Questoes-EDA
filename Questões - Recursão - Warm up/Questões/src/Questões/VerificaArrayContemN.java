package Questões;

public class VerificaArrayContemN {

	public static boolean contemN(int[] array, int n) {
		return contemNrecursivo(array, n, 0);
	}

	private static boolean contemNrecursivo(int[] array, int n, int indice) {
		boolean result = false;
		
		if(indice == n) {
			
		}
		
		if(indice < array.length) {
			if(array[indice] == n) {
				result =  true;
				
			} else {
			result = contemNrecursivo(array, n, indice+1);
			}
		} 
		
		return result;
	}
}
