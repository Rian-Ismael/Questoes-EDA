package EstudosBuscaBinaria;

public class floor {
	
	public static void main(String[] args) {
		
		Integer[] array = {2,2,2,3,3,3};
		
		System.out.println(buscaFloor(array, 0, array.length-1, 3));
	}
	
	public static Integer buscaFloor(Integer[] array, int leftIndex, int rightIndex, int x) {
		int result = -1;

		if(leftIndex <= rightIndex) {
			
			int middle = (leftIndex + rightIndex) / 2;
			
			//leftIndex == rightIndex
			if(array[leftIndex] == x) {
				result = array[leftIndex];
			}
			
			else if(array[rightIndex] <= x) {
				result = array[rightIndex];
			}
		
			// 1 2 3 4 5
			//6
			else if((array[middle] <= x) && array[middle+1] > x) {
				result = array[middle];
				
			} else if (array[middle] > x) {
				result = buscaFloor(array, leftIndex, middle-1, x);
				
			} else { // do contrário, o meio é menor que o meu x, portanto, verificar o lado esquerdo // array[middle] < x
				result = buscaFloor(array, middle+1, rightIndex, x);
			}
			
		}
		
		return result;
		
	}
}
