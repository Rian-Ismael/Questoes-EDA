package BuscaBinaria;

public class buscaBinaria {
	public static int buscaBinaria(int[] array, int leftIndex, int rightIndex, int k) {
		if(leftIndex < rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			if(array[middle] == k) {
				return middle;
			}
			
			if (k > array[middle])  {
				return buscaBinaria(array, middle+1, rightIndex, k);
			} else {
				return buscaBinaria(array, leftIndex, middle-1, k);
			}
		} else {
			return -1;
		}
	}
}
