package InsertionSort;

public class insertionSortRecursive {
    
	public static void insertionSort(int[] arr, int leftIndex, int rightIndex) {
	    if (leftIndex < rightIndex) {
	    	
	        insertionSort(arr, leftIndex, rightIndex - 1);
	        
	        int key = arr[rightIndex];
	        
	        int j = rightIndex - 1; 
	        
	        while (j >= leftIndex && arr[j] > key) { // compara o antecessor arr[j] com o sucessor key.
	            int aux = arr[j];
	            arr[j] = arr[j + 1]; 
	            arr[j+1] = aux; 
	            j--;
	        } 
	    }
	}
}
