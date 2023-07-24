package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import orderStatistic.KLargestOrderStatisticsImpl;
import orderStatistic.QuickSelect;

public class testeKLargest {

	KLargestOrderStatisticsImpl largest;
	
	
	@Before
	public void setUp()  {
		this.largest = new KLargestOrderStatisticsImpl();
	}
	
	@Test
	public void test() {
		Integer[] array = {2, 5, 4, 8, 7};
		
		Integer[] esperado = {7, 8};
		
		Comparable[] result = largest.getKLargest(array, 2);
		
		assertArrayEquals(esperado, result);
	}

}
