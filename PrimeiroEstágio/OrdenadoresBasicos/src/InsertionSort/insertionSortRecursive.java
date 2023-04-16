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
	
	public static void insertionRecursivo(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			insertionRecursivo(array, leftIndex, rightIndex-1);
			
			int key = array[rightIndex];
			int j = rightIndex-1;
			
			while(j >= leftIndex && array[j] > key) {
				int aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
				j--;
			}
		}
	}
}