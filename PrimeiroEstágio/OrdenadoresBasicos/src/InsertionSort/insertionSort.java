package InsertionSort;

public class insertionSort {
	public static void insertionSort1(int[] array, int leftIndex, int rightIndex) {
		for(int i = leftIndex + 1; i <= rightIndex; i++) {
			int j = i;
			while(j > leftIndex && array[j] < array[j-1]) {
				int aux = array[j-1];
				array[j-1] = array[j];
				array[j] = aux;
				j--;
			}
		}
	}
	
	public static void insertionSort2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex+1; i <= rightIndex; i++) {
				int j = i;
				while(j > leftIndex && array[j] < array[j-1]) {
					int aux = array[j-1];
					array[j-1] = array[j];
					array[j] = aux;
					j--;
				}
			}
		}
	}
	
	public static void insertionSort3(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex+1; i <= rightIndex; i++) {
				int j = i;
				while(j > leftIndex && array[j] < array[j-1]) {
					int aux = array[j-1];
					array[j-1] = array[j];
					array[j] = aux;
					j--;
				}
			}
		}
	}
	
	public static void insertion(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex+1; i <= rightIndex; i++) {
				int j = i;
				while(j > 0 && array[j] < array[j-1]) {
					int aux = array[j-1];
					array[j-1] = array[j];
					array[j] = aux;
					j--;
				}
			}
		}
	}
}
