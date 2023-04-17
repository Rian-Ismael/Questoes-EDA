package nlogn;

public class mergeSort {
	 public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
		 if(leftIndex < rightIndex) {
			 int meio = (leftIndex + rightIndex) / 2;
			 mergeSort(array, leftIndex, meio);
			 mergeSort(array, meio+1, rightIndex);
			 merge(array, meio, leftIndex, rightIndex);
		 }
	 }

	private static void merge(int[] array, int meio, int leftIndex, int rightIndex) {
		int[] helper = new int[array.length];
		
		for(int i = leftIndex; i <= rightIndex; i++) {
			helper[i] = array[i];
		}

		int j = meio+1;
		int i = leftIndex;
		int k = 0;
		
		while(i <= meio && j <= rightIndex) {
			if(helper[i] <= helper[j]) {
				array[k++] = helper[i++];
			} else {
				array[k++] = helper[j++];
			}
		}
		
		while(i <= meio) {
			array[k++] = helper[i++];
		}
		
		while(j <= rightIndex) {
			array[k++] = helper[j++];
		}
	}
}
