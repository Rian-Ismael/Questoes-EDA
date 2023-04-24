package OrdenacaoLinear;

public class countingSort {

	public static int[] countingSort(int[] array, int k) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		
		int[] A = new int[k];
		
		//frequencia
		for(int i = 0; i < array.length; i++) {
			A[array[i]-1] += 1;
		}
		
		//cumulativa
		for(int i = 1; i < A.length; i++) {
			A[i] += A[i-1];
		}
		
		int[] B = new int[array.length];
		
		for(int i = array.length-1; i >= 0; i--) {
			B[A[array[i]-1] -1] = array[i];
			A[array[i] - 1]--;
		}
	
		return B;
	}
	
	public static int[] countingSortCom0(int[] array, int k) {
		//int max = array[0];
		//for(int i = 1; i < array.length; i++) {
			//if(array[i] > max) {
				//max = array[i];
			//}
		//}
		
		
		int[] A = new int[k+1];
		
		//frequencia
		for(int i = 0; i < array.length; i++) {
			A[array[i]]++;
		}
		
		//cumulativa
		for(int i = 1; i < A.length; i++) {
			A[i] += A[i-1];
		}
		
		int[] B = new int[array.length];
		
		for(int i = array.length-1; i >= 0; i--) {
			B[A[array[i]] -1] = array[i];
			A[array[i]]--;
		}
	
		return B;
	}
}
