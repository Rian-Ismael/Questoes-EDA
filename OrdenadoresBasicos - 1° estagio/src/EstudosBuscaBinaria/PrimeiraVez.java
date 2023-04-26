package EstudosBuscaBinaria;

public class PrimeiraVez {
	public static void main(String[] args) {
		Integer[] array = {7, 8};
		
		System.out.println(primeiro(array, 0, array.length-1, 8));
	}
	
	public static int primeiro(Integer[] array, int leftIndex, int rightIndex, int x) {
		int result = -1;
		
		if(leftIndex <= rightIndex) {
			
			int middle = (leftIndex + rightIndex) / 2;
			
			if(array[leftIndex] == x) {
				result = leftIndex;
				
			// 1 4 4 6 6 6	
			} else if(middle != 0 && array[middle] == x && !(array[middle-1] == x)) {
				result = middle;
				
			} else if(array[middle] < x) {
				result = primeiro(array, middle+1, rightIndex, x);
				
			} else {
				result = primeiro(array, leftIndex, middle-1, x);
			}
		}
		
		return result;
	}
}
