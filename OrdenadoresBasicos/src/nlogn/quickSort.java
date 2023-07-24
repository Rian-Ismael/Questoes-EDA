package nlogn;

public class quickSort {
	public static void quickSort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			
			int index_partition = partition(array, leftIndex, rightIndex);
			
			quickSort(array, leftIndex, index_partition-1);
			quickSort(array, index_partition+1, rightIndex);
			
		}
	}

	private static int partition(int[] array, int leftIndex, int rightIndex) {

		
		int mediaThree_pivot = partitionMedia(array, leftIndex, rightIndex);
		
		int aux = array[leftIndex];
		array[leftIndex] = array[mediaThree_pivot];
		array[mediaThree_pivot] = aux;
		
		int pivot = array[leftIndex];
		int k = leftIndex;
		
		for(int i = leftIndex+1; i <= rightIndex; i++) {
			if(array[i] < pivot) {
				k++;
				int aux1 = array[k];
				array[k] = array[i];
				array[i] = aux1;
			}
		}
		
		int aux2 = array[leftIndex];
		array[leftIndex] = array[k];
		array[k] = aux2;
		
		return k;
	}
	
	public static int partitionMedia(int[] array, int leftIndex, int rightIndex) {
		int meio = (leftIndex + rightIndex) / 2;
		int[] values = {array[leftIndex], array[meio], array[rightIndex]};
		
		if(values[0] > values[1]) {
			int aux = values[0];
			values[0] = values[1];
			values[1] = aux;
		} if(values[1] > values[2]) {
			int aux = values[1];
			values[1] = values[2];
			values[2] = aux;
			if(values[1] > values[0]) {
				int aux1 = values[0];
				values[0] = values[1];
				values[1] = aux1;
			}
		}
		
		if(values[1] == array[meio]) return meio;
		else if(values[0] == array[leftIndex]) return leftIndex;
		else return rightIndex;
	}
}
