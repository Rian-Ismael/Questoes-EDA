package orderStatistic;

import util.Util;

/**
 * O quickselect eh um algoritmo baseado no quicksort para
 * descobrir/selectionar, em tempo linear, a k-esima estatistica de ordem
 * (k-esimo menor elemento) de um conjunto de dados.
 *
 * O quiskselect escolhe um elemento para ser o pivot e particiona o array
 * inicial em dois subarrays da mesma forma que o quicksort (elementos menores
 * que o pivot a esquerda do pivot e elementos maiores que o pivot a direita
 * dele). Entretanto, ao inves de chamar o quicksort recursivo nas duas metades,
 * o quickselect eh executado (recursivamente) apenas na metade que contem o
 * elemento que ele procura (o k-esimo menor elemento). Isso reduz a
 * complexidade de O(n.log n) para O(n)
 *
 * @author adalberto e campelo
 *
 */
public class QuickSelect<T extends Comparable<T>> {

	/**
	 * O algoritmo quickselect usa a mesma abordagem do quicksort para calcular o
	 * k-esimo menor elemento (k-esima estatistica de ordem) de um determinado
	 * array de dados comparaveis. Primeiro ele escolhe um elemento como o pivot
	 * e particiona os dados em duas partes, baseando-se no pivot (exatemente da
	 * mesma forma que o quicksort). Depois disso, ele chama recursivamente o
	 * mesmo algoritmo em apenas uma das metades (a que contem o k-esimo menor
	 * elemento). Isso reduz a complexidade de O(n.log n) para O(n).
	 *
	 * Caso o array seja vazio ou a ordem (posicao) do elemento desejado esteja
	 * fora do tamanho do array, o metodo deve retornar null.
	 *
	 *
	 * @param array
	 *            o array de dados a procurar o k-esimo menor elemento
	 *            este array normalmente nao esta ordenado
	 * @param k
	 *            a ordem do elemento desejado. 1 significa primeiro menor
	 *            elemento, 2 significa segundo menor elemento e assim por
	 *            diante
	 * @return
	 *
	 */
	public T quickSelect(T[] array, int k) {
		T result = null;
		if(array.length != 0 && k > 0) {
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
			
			// peço o 3 menor 
			// index == indice no array.
			//k - 1 == indice 
			// se k - 1 < index quer dizer que o valor 
			
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