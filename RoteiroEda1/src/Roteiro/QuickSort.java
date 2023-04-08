package Roteiro;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
		quickSort(elements, 0, elements.length-1);
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] values, int left, int right) {
		if(left < right) {
			
			int index_pivot = partition(values, left, right);
			quickSort(values, left, index_pivot-1);
			quickSort(values, index_pivot+1, right);
		}
	} 
	

	public static <T extends Comparable<T>> int partition(T[] values, int left, int right) {
		T pivot = values[left];
		int random_pivot = partitionMediana(values, left, right);
		 
		swap(values, left, random_pivot);
		
		
		int k = left;
		for(int i = left + 1; i <= right; i++) {
			if(values[i].compareTo(pivot) < 0) {
				k++;
				swap(values, k, i);
			}
		}
		
		swap(values, left, k);
		return k;
	}
	
	

	public static <T extends Comparable<T>> int partitionRandom(T[] values, int left, int right) {
		int range = right - left + 1;
		
		int random_pivot = (int) (Math.random() * range) + left;
		
		return random_pivot;
		
	}
	
	
	public static <T extends Comparable<T>> int partitionMediana(T[] values, int left, int right) {
	    int middle = (left + right) / 2;
	    T[] sorted = (T[]) new Comparable[]{values[left], values[middle], values[right]};
	    Arrays.sort(sorted);
	    
	    if(sorted[1].equals(values[left])) return left;
	    else if(sorted[1].equals(values[middle])) return middle;
	    else return right;
	}

	

	private  static <T extends Comparable<T>> void swap(T[] values, int i, int j) {
		T aux = values[i];
		values[i] = values[j];
		values[j] = aux;
	}
}
