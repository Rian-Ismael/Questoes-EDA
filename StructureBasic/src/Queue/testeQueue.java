package Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeQueue {

	@Test
	void test() {
		Queue queue = new Queue(5);
		
		assertTrue(queue.isEmpty());
		assertEquals(queue.size(), 0);
		
		queue.add(15);
		queue.add(45);
		queue.add(75);
		queue.add(23);
		queue.add(34);
		
		try {
			queue.add(50);
			fail("QueueIsFullException");
		} catch (RuntimeException e) {
			
		}
		
		assertTrue(queue.isFull());
		
		assertEquals(queue.remove(), 15);
		assertEquals(queue.remove(), 45);
		
		assertEquals(queue.size(), 3);
		
		queue.remove();
		queue.remove();
		queue.remove();
		
		assertTrue(queue.isEmpty());
		
		try {
			queue.remove();
			fail("QueueIsEmptyException");
		} catch (RuntimeException e) {
			
		}
	}

}
