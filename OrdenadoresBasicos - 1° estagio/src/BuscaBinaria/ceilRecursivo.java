package BuscaBinaria;

public class ceilRecursivo {

	public static int  binarySearchCeil(int[] array, int chave, int left, int right ) {
        int result = -1;
        
        if(left <= right) {
        	
            int middle = (left + right) / 2;
            
            if(chave == array[middle]) {
                result = chave;
                
            } else if(array[left] >= chave) {
                result = array[left];
            }
            else if(array[middle] < chave) {
                result = binarySearchCeil(array, chave, middle + 1, right);
                
            } else {
                result = binarySearchCeil(array, chave, left, middle - 1);
            }
            }
            
        return result;
	}
}
