package BuscaBinaria;

public class buscaBinaria {
	public static int buscaBinaria1(int[] array, int leftIndex, int rightIndex, int k) {
		if(leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			if(array[middle] == k) {
				return middle;
			}
			
			if (k > array[middle])  {
				return buscaBinaria1(array, middle+1, rightIndex, k);
			} else {
				return buscaBinaria1(array, leftIndex, middle-1, k);
			}
		} else {
			return -1;
		}
	}
	
	public static int buscaBinaria2(int[] array, int leftIndex, int rightIndex, int k) {
		if(leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			
			if(array[middle] == k) {
				return middle;
			}
			
			if(k > array[middle]) {
				return buscaBinaria2(array, middle+1, rightIndex, k);
			} else {
				return buscaBinaria2(array, leftIndex, middle-1, k);
			}
		} else {
			return -1;
		}
	}
	
	public static int buscaBinaria3(int[] array, int leftIndex, int rightIndex, int k) {
		if(leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			
			if(array[middle] == k) {
				return middle;
			}
			
			if(k > array[middle]) {
				return buscaBinaria3(array, middle+1, rightIndex, k);
				
			} else {
				return buscaBinaria3(array, leftIndex, middle-1, k);
			}
		} else {
			return -1;
		}
		
	}
}
