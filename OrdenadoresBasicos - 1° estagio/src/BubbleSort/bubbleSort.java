package BubbleSort;

public class bubbleSort {
	public static void bubbleSort1(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			boolean swapped = true;
			for(int i = leftIndex; i <= rightIndex; i++) {
				swapped = false;
				for(int j = leftIndex; j < rightIndex; i++) {
					if(array[j] > array[j+1]) {
						int aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
	                    swapped = true;
					}
				}
				if(!swapped) {
					break;
					}
			}
		}
	}
	
	
	public static void bubbleSort2(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			boolean swapped = true;
			for(int i = leftIndex; i <= rightIndex; i++) {
				swapped = false;
				for(int j = leftIndex; i < rightIndex; j++) {
					if(array[j] > array[j+1]) {
						int aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
						swapped = true;
					}
				}
				if(!swapped) {
					break;
				}
			}
		}
	}
	
	public static void bubbleSort3(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			boolean swapped = true;
			for(int i = leftIndex; i <= rightIndex; i++) {
				swapped = false;
				for(int j = leftIndex; j < rightIndex; j++) {
					if(array[j] > array[j+1]) {
						int aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
						swapped = true;
					}
				}
				if(!swapped) {
					break;
				}
			}
		}
	}
	
	public static void bubbleSort4(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			boolean swapped = true;
			for(int i = leftIndex; i <= rightIndex; i++) {
				swapped = false;
				for(int j = leftIndex; j < rightIndex; j++) {
					if(array[j] > array[j+1]) {
						int aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
						swapped = true;
					}
				}
				if(!swapped) {
					break;
				}
			}
		}
	}
	
	public static void bubble(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			boolean swapped = true;
			for(int i = leftIndex; i <= rightIndex; i++) {
				swapped = false;
				for(int j = leftIndex; j < rightIndex; j++) {
					if(array[j] > array[j+1]) {
						int aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
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
