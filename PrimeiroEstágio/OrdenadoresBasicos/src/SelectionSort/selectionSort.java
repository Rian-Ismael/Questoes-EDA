package SelectionSort;

public class selectionSort {
	public static void selectionSort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i <= rightIndex; i++) {
				int i_menor = i;
				for(int j = i + 1; j <= rightIndex; j++) {
					i_menor = j;
				}
				int aux = array[i_menor];
				array[i_menor] = array[i];
				array[i] = aux;
			}
		}
	}
}
