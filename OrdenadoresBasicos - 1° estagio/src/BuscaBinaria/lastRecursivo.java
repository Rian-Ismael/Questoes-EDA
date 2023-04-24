package BuscaBinaria;

public class lastRecursivo {
	public static int lastOcurrence(int[] array, int x, int left, int right) {
        int result = -1;
        
        if(left <= right) {
            int middle = (left + right) / 2;
            
            if(middle != right && array[middle + 1] == x) {
                result = lastOcurrence(array,x,middle + 1,right);
                
            } else if(array[middle] == x) { 
                result = middle;
                
            } else if(array[middle] > x) {
                result = lastOcurrence(array,x,left,middle - 1);
                
            } else {
                result = lastOcurrence(array,x,middle + 1, right);
            }
        }
        return result;
        }
}
