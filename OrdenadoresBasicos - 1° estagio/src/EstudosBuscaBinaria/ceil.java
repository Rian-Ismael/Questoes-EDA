package EstudosBuscaBinaria;

public class ceil {

	public static void main(String[] args) {
		Integer[] array = {7, 10, 15, 20, 23};
		
		System.out.println(buscaCeil(array, 0, array.length-1, 8));
	}
	
    public static int buscaCeil(Integer[] array, int leftIndex, int rightIndex, int x) {
        int result = -1;
        
        if(leftIndex <= rightIndex) {
            
            int middle = (leftIndex + rightIndex) / 2;
            
            if(array[leftIndex] >= x) {
                result = array[leftIndex];
            }
            
            else if(array[rightIndex] == x) {
                result = array[rightIndex];
            }
            
            else if(array[middle] >= x && array[middle-1] < x) {
                result = array[middle];
                
            } else if(array[middle] < x) {
                result = buscaCeil(array, middle+1, rightIndex, x);
                
            } else {
                result = buscaCeil(array, leftIndex, middle-1, x);
            }
        }
        return result;
    }
}
