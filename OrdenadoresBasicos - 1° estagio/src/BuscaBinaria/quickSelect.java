package BuscaBinaria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

 class quickSelect<T extends Comparable<T>> {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int[] nums = StringToInt(sc.nextLine().split(" "));
       int[] numsCopy = Arrays.copyOf(nums, nums.length);
       // encontrar a estatística de ordem do primeiro elemento
       int ordemPrimeiroElemento = quickSelect(nums, 0, nums.length - 1, 3);
     
       System.out.println(ordemPrimeiroElemento);
    }
    
	public static int[] StringToInt(String[] valoresString) {
		int[] valoresInt = new int[valoresString.length];
		
		for(int i = 0; i < valoresString.length; i++) {
			valoresInt[i] = Integer.parseInt(valoresString[i]);
		}
		
		return valoresInt;
	}
    
	 public static int partition(int[] nums, int left, int right) {
		 	int pIndex = rand(nums, left, right);
		    int pivot = nums[left];
		    
		    swap(nums, left, pIndex);
		    
		    
		    int pIndexFinal = left;
		    for (int i = left + 1; i <= right; i++) {
		        if (nums[i] < pivot) {
		            pIndexFinal++;
		            swap(nums, i, pIndexFinal);
		        }
		    }
		    
		    // move o pivô para sua posição final //
		    swap(nums, left, pIndexFinal);

		    return pIndexFinal;
		}

		private static void swap(int[] arr, int i, int j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}

	
		public static int rand(int[] values, int left, int right) {
			int range = right - left + 1;
			
			int random_pivot = (int) (Math.random() * range) + left;
			
			return random_pivot;
			
		}
 
 

		public static int quickSelect(int[] nums, int left, int right, int k)
	    {
	        if (left == right) {
	            return nums[left];
	        }

	        int pIndex = partition(nums, left, right);
	 
	        if (k - 1 == pIndex) {
	            return nums[k];
	        }
	 
	        else if (k - 1 < pIndex) {
	            return quickSelect(nums, left, pIndex - 1, k);
	        }
	 
	        else {
	            return quickSelect(nums, pIndex + 1, right, k);
	        }
	    }
		
		// outra forma
		//public class quickSelect<T extends Comparable<T>> {
		    public T quickselect(T[]array, int inicio, int fim, int k){
		        int i = inicio;
		        T pivot = array[inicio];
		        for(int j=inicio+1;j <= fim;j++){
		            if(array[j].compareTo(pivot)<0){
		                i++;
		                swap(array,i,j);
		            }
		        }
		            swap(array,i,inicio);
		            
		            if(k==i+1){
		                return pivot;
		            }else if(k < i + 1){
		                return quickselect(array, inicio, i-1, k);
		            }else{
		                return quickselect(array, i+1,fim,k);
		            }
		        }

		    private void swap(T[] array, int i, int j) {
		        T temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		    }
}

