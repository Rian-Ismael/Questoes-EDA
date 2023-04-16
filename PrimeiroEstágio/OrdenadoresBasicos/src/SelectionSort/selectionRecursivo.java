package SelectionSort;

public class selectionRecursivo {
	public static void selectionRecursivo(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int i_menor = leftIndex;
			for(int i = leftIndex+1; i <= rightIndex; i++) {
				if(array[i_menor] > array[i]) {
					i_menor = i;
				}
			}
			int aux = array[i_menor];
			array[i_menor] = array[leftIndex];
			array[leftIndex]  = aux;
			selectionRecursivo(array, leftIndex+1, rightIndex);
		}
	}
}
