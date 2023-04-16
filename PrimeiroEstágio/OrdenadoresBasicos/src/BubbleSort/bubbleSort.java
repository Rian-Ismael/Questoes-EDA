package BubbleSort;

public class bubbleSort {
	public static void bubbleSort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
		boolean swapped = true;
		for(int i = leftIndex; i <= rightIndex; i++) {
			swapped = false;
			for(int j = leftIndex; j < rightIndex; i++) {
				if(array[j] > array[j+1]) {
					int aux = array[j+1];
					array[j+1] = array[j];
					array[j+1] = aux;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
				}
			}
		}
	}
}
