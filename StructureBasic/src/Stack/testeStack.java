package Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeStack {

	@Test
	void test() {
		Stack stack = new Stack(5);
		
		assertTrue(stack.isEmpty());
		
		stack.push(10);
		assertFalse(stack.isEmpty());
		
		
		assertEquals(stack.pop(), 10);
		
		stack.push(34);
		stack.push(12);
		assertEquals(stack.peek(), 12);
		stack.push(67);
		stack.push(27);
		stack.push(53);
		assertEquals(stack.peek(), 53);
		
		try {
			stack.push(53);
			fail("Não deveria ter sido executado");
		} catch (RuntimeException e) {
			 
		}
		
		assertTrue(stack.isFull());
		
		assertEquals(stack.size(), 5);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertEquals(stack.size(), 0);
		
		try {
			stack.pop();
			fail("Não deveria ter sido executado");
		} catch (RuntimeException e) {
			
		}
	}

}
