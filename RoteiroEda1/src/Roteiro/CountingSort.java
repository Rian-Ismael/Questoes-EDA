package Roteiro;

public class CountingSort {

	public static void main(String[] args) {
		
	}
	
	 public static void sort(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return;
	        }

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        int range = max - min + 1;
	        int[] count = new int[range];

	        for (int i = 0; i < arr.length; i++) {
	            count[arr[i] - min]++;
	        }

	        for (int i = 1; i < range; i++) {
	            count[i] += count[i - 1];
	        }

	        int[] output = new int[arr.length];

	        for (int i = arr.length - 1; i >= 0; i--) {
	            output[count[arr[i] - min] - 1] = arr[i];
	            count[arr[i] - min]--;
	        }

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = output[i];
	        }
	    }
}
