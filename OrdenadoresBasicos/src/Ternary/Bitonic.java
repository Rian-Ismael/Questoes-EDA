package Ternary;

/**
 * Interface que representa uma busca binária em um array Bitônico.
 * 
 * Um array Bitônico é um array podendo conter duas partições: uma ordenada
 * de forma crescente (sempre vem primeiro) e outra ordenada de forma decrescente.
 * O ponto bitônico desse array é o maior valor que divide essas duas partições.
 * 
 * Por exemplo:
 * O ponto bitônico do array [7,12,16, 20, 7,4,2,1] é o 20, pois do início até ele
 * tem-se os elementos em ordem crescente e apos ele tem-se os elementos em ordem
 * decrescente.
 * 
 * Pode acontecer de uma das partições (crescente ou decrescente) não exista no array
 * mas o ponto bitônico sempre será o elemento de maior valor.
 */

public class Bitonic {
	
	public static int bitonico(Integer[] array) {
		Integer result = null;
		
		if(array.length != 0 && array != null) {
			result = procura(array, 0, array.length-1);
		}
		return result;
	}
	
	public static int procura(Integer[] array, int leftIndex, int rightIndex) {
		
		Integer result = null;
		
		if(leftIndex <= rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			
			if(middle != rightIndex && middle != 0  && array[middle-1] < array[middle] && array[middle] > array[middle+1]) {
				result = array[middle];
				
			} else if(array[rightIndex] > array[rightIndex-1]) {
				result = array[rightIndex];
				
			} else if(array[middle+1] > array[middle]) {
				result = procura(array, middle+1, rightIndex);
			} else {
				result = procura(array, leftIndex, middle-1);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 5, 3, 2, 1};
		
		Integer[] array2 = {1, 2, 5};
		
		Integer[] array3 = {5, 9, 5, 4, 2};
		
		System.out.println(bitonico(array3));
		
	}
}
