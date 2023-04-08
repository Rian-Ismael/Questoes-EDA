package Questões;

public class SomaElementosDeUmArray {

	public static int somaElementosArray(int[] array) {
		return somaElementosArrayRecursivo(array, 0);
	}

	private static int somaElementosArrayRecursivo(int[] array, int indice) {	
		int result = 0;
		if (array.length == indice) {
			
		} else {
			result = array[indice] + somaElementosArrayRecursivo(array, indice+1);
		}
		return result;
	}
	
	
}
