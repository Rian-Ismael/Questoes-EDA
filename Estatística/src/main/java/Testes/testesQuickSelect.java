package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import orderStatistic.QuickSelect;

public class testesQuickSelect {

	QuickSelect<Integer> select;
	
	@Before
	public void setUp()  {
		select = new QuickSelect();
	}

	@Test
	public void test1() {
		Integer[] array = {1, 2, 3, 4, 5};
		
		Integer esperado = 1;
		Integer resultado = select.quickSelect(array, 1);
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void test2() { 
		Integer[] array = {1, 2, 3, 4, 5};
		
		Integer esperado = 1;
		Integer resultado = select.quickSelect(array, 1);
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void test3() {
		Integer[] array = {11, 5, 12, 44, 9, 1};
		
		Integer esperado = 9;
		Integer resultado = select.quickSelect(array, 3);
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void test4() {
		Integer[] array = {1};
		
		Integer esperado = 1;
		Integer resultado = select.quickSelect(array, 1);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test5() {
		Integer[] array = {1, 2};
		
		Integer esperado = null;
		Integer resultado = select.quickSelect(array, 3);
		
		assertEquals(esperado, resultado);
	}

}
