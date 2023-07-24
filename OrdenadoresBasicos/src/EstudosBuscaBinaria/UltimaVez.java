package EstudosBuscaBinaria;

public class UltimaVez {

	public static void main(String[] args) {
		Integer[] array = {8};
		
		System.out.println(ultimo(array, 0, array.length-1, 8));
	}
	
	public static int ultimo(Integer[] array, int leftIndex, int rightIndex, int x) {
		int result = -1;
		
		if(leftIndex <= rightIndex) {
			int middle = (leftIndex + rightIndex) /2;
			
			if(array[rightIndex] == x) {
				result = rightIndex;
			}
			else if(middle != rightIndex && array[middle] == x && !(array[middle+1] == x)) {
				result = middle;
				
			} else if (array[middle] > x) {
				result = ultimo(array, leftIndex, middle-1, x);
				
			} else {
				result = ultimo(array, middle+1, rightIndex, x);
			}
		}
		return result;
	}
	
}
