package problems;

public class FloorBinarySearchImpl implements Floor {
	 
	@Override
	public Integer floor(Integer[] array, Integer x) {
		return floor(array, 0, array.length-1, x);
	}
	
	private Integer floor(Integer[] array, Integer leftIndex, Integer rightIndex, Integer x) {
		
		Integer result = -1;
		 
		if(leftIndex <= rightIndex && rightIndex < array.length) {
			
			Integer middle = (leftIndex + rightIndex) /2;
			 
			
			if(array[rightIndex] <= x) {
				result = array[rightIndex];
			}

			else if(middle != rightIndex && array[middle] <= x && !(array[middle+1] < x)) {
				result = array[middle]; 
				
			} else if(array[middle] > x) {
				result = floor(array, leftIndex, middle-1, x);
				
			} else {
				result = floor(array, middle+1, rightIndex, x);
			}
				 
		}
		
		return result;
	}
}
