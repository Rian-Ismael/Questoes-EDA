package Roteiro;

public class BubbleSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
		boolean swapped;
		for(int i = 0; i < elements.length; i++) {
			swapped = false;
			for(int j = 0; j < elements.length - 1 - i; j++) {
				if((elements[j].compareTo(elements[j+1]) > 0)) {
					T aux = elements[j+1];
					elements[j+1] = elements[j];
					elements[j] = aux;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}

	
}
