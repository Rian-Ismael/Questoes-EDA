package BubbleSort;

public class bubbleRecursivo {

	public static void bubbleSortRecursivo1(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
		for(int i = leftIndex; i < rightIndex; i++) {
			if(array[i] < array[i+1]) {
				int aux = array[i+1];
				array[i+1] = array[i];
				array[i] = aux;
				}
			}
		bubbleSortRecursivo1(array, leftIndex, rightIndex-1);
		}
	}
	
	public static void bubbleSortRecursivo2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i < rightIndex; i++) {
				if(array[i] > array[i+1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
				}
			}
			bubbleSortRecursivo2(array, leftIndex, rightIndex-1);
		}
	}
	
	public static void bubbleSortRecursivo3(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i < rightIndex; i++) {
				if(array[i] > array[i + 1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
				}
			}
			bubbleSortRecursivo3(array, leftIndex, rightIndex-1);
		}
	}
	
	public static void bubble(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i < rightIndex; i++) {
				if(array[i] > array[i+1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					
				}
			}
			bubble(array, leftIndex, rightIndex-1);
		}
	}
}
