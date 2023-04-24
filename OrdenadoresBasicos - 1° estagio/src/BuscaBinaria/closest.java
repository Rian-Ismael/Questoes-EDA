package BuscaBinaria;

public class closest {
    public static  int closest(int[]array, int x){
        int left = 0;
        
        int right = array.length -1;
        
        int closest = -1;

        while(left <= right){
            int mid=(left + right)/2;

            if(array[mid] == x){
                return array[mid];
                
            } if(array[mid] > x){
                right= mid - 1;
                
            } else{
                left= mid + 1;
            }
            
            if (closest == -1 || Math.abs(array[mid] - x) < Math.abs(closest - x)) {// Verifica se a diferença entre o elemento atual e x é 
            																		//menor do que a diferença entre o closest atual e x.
                closest = array[mid];
            }
            
        }
        return closest;
    }
}
