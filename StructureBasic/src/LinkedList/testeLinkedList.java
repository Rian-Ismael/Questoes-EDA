package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeLinkedList {

	@Test
	void test() {
		LinkedList lk = new LinkedList();
		 
		// 3 2 1
		
		lk.add(0, 1);
		assertTrue(lk.contains(1));
		
		lk.add(0, 2); 
		lk.add(0, 3);

		assertTrue(lk.contains(1));
		assertTrue(lk.contains(2));
		
		assertEquals(0, lk.indexOf(3));
		assertEquals(2, lk.indexOf(1));
		assertEquals(1, lk.indexOf(2));
	
		
		assertEquals(3, lk.size());
		
		assertTrue(lk.contains(1));
	}

}
