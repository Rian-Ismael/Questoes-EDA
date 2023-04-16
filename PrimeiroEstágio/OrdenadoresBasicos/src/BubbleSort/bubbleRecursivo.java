package BubbleSort;

public class bubbleRecursivo {

	public static void bubbleRecursivo(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
		for(int i = leftIndex; i < rightIndex; i++) {
			if(array[i] < array[i+1]) {
				int aux = array[i+1];
				array[i+1] = array[i];
				array[i] = aux;
				}
			}
		bubbleRecursivo(array, leftIndex, rightIndex-1);
		}
	}
}
