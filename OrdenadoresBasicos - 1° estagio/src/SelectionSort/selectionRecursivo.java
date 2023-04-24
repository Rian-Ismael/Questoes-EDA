package SelectionSort;

public class selectionRecursivo {
	public static void selectionRecursivo1(int[] array, int leftIndex, int rightIndex) {
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
			selectionRecursivo1(array, leftIndex+1, rightIndex);
		}
	}
	
	public static void selectionSortRecursivo2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int i_menor = leftIndex;
			for(int i = leftIndex + 1; i<= rightIndex; i++) {
				if(array[i_menor] > array[i]) {
					i_menor = i;
				}
			}
			int aux = array[i_menor];
			array[i_menor] = array[leftIndex];
			array[leftIndex] = aux;
			selectionSortRecursivo2(array, leftIndex+1, rightIndex);
		}
	}
	
	public static void selectionSortRecursivo3(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int i_menor = leftIndex;
			for(int i = leftIndex + 1; i <= rightIndex; i++) {
				if(array[i_menor] > array[i]) {
					i_menor = i;
				}
			}
			
			int aux = array[i_menor];
			array[i_menor] = array[leftIndex];
			array[leftIndex] = aux;
			selectionSortRecursivo3(array, leftIndex+1, rightIndex);
		}
	} 
	
	public static void selection(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int i_menor = leftIndex;
			for(int i = leftIndex + 1; i<= rightIndex; i++) {
				if(array[i_menor] > array[i]) {
					i_menor = i;
				}
			}
			int aux = array[i_menor];
			array[i_menor] = array[leftIndex];
			array[leftIndex] = aux;
			selection(array, leftIndex+1, rightIndex);
		}
	}
}
