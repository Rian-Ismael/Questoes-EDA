package SelectionSort;

public class selectionSort {
	public static void selectionSort1(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i <= rightIndex; i++) {
				int i_menor = i;
				for(int j = i + 1; j <= rightIndex; j++) {
					if(array[j] < array[i_menor]) {
						i_menor = j;
					}
				}
				int aux = array[i_menor];
				array[i_menor] = array[i];
				array[i] = aux;
			}
		}
	}
	
	public static void selectionSort2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i <= rightIndex; i++) {
				int i_menor = i;
				for(int j = i + 1; j <= rightIndex; j++) {
					if(array[j] < array[i_menor]) {
						i_menor = j;
					}
				}
				int aux = array[i_menor];
				array[i_menor] = array[i];
				array[i] = aux;
				
			}
		}
	}
	
	public static void selectionSort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i <= rightIndex; i++) {
				int i_menor = i;
				for(int j = i +1; j <= rightIndex; j++) {
					if(array[i_menor] > array[j]) {
						i_menor = j;
					}
				}
				
				int aux = array[i_menor];
				array[i_menor] = array[i];
				array[i] = aux;
			}
		}
	}
	
	public static void selection(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for(int i = leftIndex; i <= rightIndex; i++) {
				int i_menor = i;
				for(int j = i + 1; i <= rightIndex; j++) {
					if(array[i_menor] > array[j]) {
						i_menor = j;
					}
				}
				int aux = array[i_menor];
				array[i_menor] = array[i];
				array[i] = aux;
			}
		}
	}
}
