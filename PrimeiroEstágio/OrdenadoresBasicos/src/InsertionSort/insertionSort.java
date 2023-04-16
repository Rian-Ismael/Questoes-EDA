package InsertionSort;

public class insertionSort {
	public static void insertionSorT(int[] array, int leftIndex, int rightIndex) {
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
}
