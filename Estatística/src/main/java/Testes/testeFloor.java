package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import problems.FloorBinarySearchImpl;

public class testeFloor {

	
	FloorBinarySearchImpl floorBinary;
	
	@Before
	public void test() {
		floorBinary = new FloorBinarySearchImpl();
	}
	
	@Test 
	public void Test1() {
		Integer[] array = {1, 5, 8, 11};
		
		Integer esperado = 1;
		Integer result = floorBinary.floor(array, 4);
		
		assertEquals(esperado, result);
	} 
	
	@Test
	public void test2() {
		Integer[] array = {1, 5, 8, 11};
		
		Integer esperado = 5;
		Integer result = floorBinary.floor(array, 6);
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void test3() {
		Integer[] array = {1, 5, 8, 11};
		
		Integer esperado = 11;
		Integer result = floorBinary.floor(array, 11);
		
		assertEquals(esperado, result);
	}
	
	/////////////////
	@Test
	public void test5() {
		Integer[] array = {1};
		
		Integer esperado = 1;
		Integer result = floorBinary.floor(array, 2);
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void test6() {
		Integer[] array = {1, 5};
		
		Integer esperado = 5;
		Integer result = floorBinary.floor(array, 6);
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void test7() {
		Integer[] array = {};
		
		Integer esperado = -1;
		Integer result = floorBinary.floor(array, 5);
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void test8() {
		Integer[] array = {1, 1, 1, 1, 1, 1};
		
		Integer esperado = 1;
		Integer result = floorBinary.floor(array, 2);
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void test9() {
		Integer[] array = {9, 10, 15, 16, 20};
		
		Integer esperado = -1;
		Integer result = floorBinary.floor(array, 8);
		
		assertEquals(esperado, result);
	}

}