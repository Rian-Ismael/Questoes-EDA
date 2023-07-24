package orderStatistic;

import util.Util;

/**
 * Uma implementacao da interface KLargest que usa estatisticas de ordem para 
 * retornar um array com os k maiores elementos de um conjunto de dados/array.
 * 
 * A k-esima estatistica de ordem de um conjunto de dados eh o k-esimo menor
 * elemento desse conjunto. Por exemplo, considere o array [4,8,6,9,12,1]. 
 * A 3a estatistica de ordem eh 6, a 6a estatistica de ordem eh 12.
 * 
 * Note que, para selecionar os k maiores elementos, pode-se pegar todas as 
 * estatisticas de ordem maiores que k. 
 * 
 * Requisitos do algoritmo:
 * - DEVE ser in-place. Porem, voce pode modificar o array original.
 *   Voce pode criar ainda um array de tamanho k que vai armazenar apenas
 *   os elementos a serem retornados.
 * - Voce DEVE usar alguma ideia de algoritmo de ordenacao visto em sala 
 *   para calcular estatisticas de ordem.
 * - Se a entrada for invalida, deve-se retornar um array vazio (por exemplo,
 *   ao solicitar os 5 maiores elementos em um array que soh contem 3 elementos).
 *   Este metodo NUNCA deve retornar null.
 * 
 * @author campelo and adalberto
 *
 * @param <T>
 */

public class KLargestOrderStatisticsImpl<T extends Comparable<T>> implements KLargest<T>{

	@Override
	public T[] getKLargest(T[] array, int k) {
		T[] largest = (T[]) new Comparable[k];
		 
		for(int i = k; i >= 0; i--) {
			T x = orderStatistics(array, k);
			largest[i] = x;
		}
	
		return largest;
		
		//este metodo deve obrigatoriamente usar o orderStatistics abaixo.
	}

	/**
	 * Metodo que retorna a k-esima estatistica de ordem de um array, usando
	 * a ideia de algum algoritmo de ordenacao visto em sala. Caso nao exista 
	 * a k-esima estatistica de ordem, entao retorna null.
	 * 
	 * Obs: o valor de k deve ser entre 1 e N.
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public T orderStatistics(T[] array, int k){
		T result = null;
		
		if(array.length != 0 && k > 0 && array.length - 1 >= k) {
			result = quickSelect(array, 0, array.length-1, k);
		}
		
		return result;
	}
	
	private int partition(T[] array, int leftIndex, int rightIndex) {
		T pivot = array[leftIndex];
		
		int k = leftIndex;
		
		for(int i = leftIndex + 1; i <= rightIndex; i++) {
			if(array[i].compareTo(pivot) < 0) { 
				k++;  
				Util.swap(array, k, i); 
			} 
		}

		Util.swap(array, leftIndex, k);
		return k;
	}
	
	private T quickSelect(T[] array, int leftIndex, int rightIndex, int k) {
		T result = null;
		 
		if(leftIndex <= rightIndex && k > 0 && rightIndex < array.length) {
			int middle = (leftIndex + rightIndex) / 2;
			
			int index = partition(array, leftIndex, rightIndex);

			if((k - 1) == index) {
				result = array[index];
				 
			} else if(index < (k - 1)) {
				result = quickSelect(array, index+1, rightIndex, k);
				
			} else {
				result = quickSelect(array, leftIndex, index-1, k);
			}
		}
		
		return result;

	}
	
}
