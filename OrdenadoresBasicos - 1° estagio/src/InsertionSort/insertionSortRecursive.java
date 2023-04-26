package InsertionSort;

public class insertionSortRecursive {
	
	public static void insertionSortRecursivo1(int[] array, int leftIndex, int rightIndex) {
	    if (leftIndex < rightIndex) {
	        insertionSortRecursivo1(array, leftIndex, rightIndex - 1);
	        int key = array[rightIndex];
	        int j = rightIndex - 1;
	        while (j >= leftIndex && array[j] > key) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}
	
	public static void insertionSortRecursivo2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			insertionSortRecursivo2(array, leftIndex, rightIndex-1);
			
			int key = array[rightIndex];
			
			int j = rightIndex - 1;
			
			while(j >= leftIndex && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}

	
	public static void insertion(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			insertion(array, leftIndex, rightIndex-1);
			
			int key = array[rightIndex];
			int j = rightIndex -1;
			
			while(j > leftIndex && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
}