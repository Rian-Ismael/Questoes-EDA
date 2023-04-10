package Roteiro;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
	    mergeSort(elements, 0, elements.length-1);
	}

	public static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right) {
	    T[] helper = Arrays.copyOf(array, array.length);
	     
	    int i = left;
	    int j = middle + 1;
	    int k = left;
	     
	    while(i <= middle && j <= right) {
	        if(helper[i].compareTo(helper[j]) <= 0) {
	            array[k++] = helper[i++];
	        } else {
	            array[k++] = helper[j++];
	        }
	    }
	    
	    while(i <= middle) {
	        array[k++] = helper[i++];
	    }
	    
	    while(j <= right) {
	        array[k++] = helper[j++];
	    }
	}

	public static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
	    if(left >= right) {
	        return;
	    } else {
	        int middle = (right + left) / 2;
	        mergeSort(array, left, middle);
	        mergeSort(array, middle+1, right);
	        merge(array, left, middle, right);
	    }
	}


}
