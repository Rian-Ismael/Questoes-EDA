package ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeArrayList {

	@Test
	void test() {
		ArrayList list = new ArrayList<String>(5);
		list.tooString();
		list.add("A");
		list.tooString();
		assertTrue(list.contains("A"));
		assertFalse(list.contains("B"));

		
		assertTrue(list.contains("A"));
		assertFalse(list.contains("H"));
		assertFalse(list.contains("G"));

		list.add("C");
		list.tooString();
		list.add("B");
		list.tooString();
		assertEquals("A", list.get(0));
		
		assertEquals(1, list.indexOf("C"));
		
		assertEquals(2, list.indexOf("B"));

		assertEquals("B", list.get(2));

		list.remove("A");
		list.tooString();
		assertFalse(list.contains("A"));
		list.add("D");
		list.tooString();
		list.add("E");
		list.tooString();
		list.add("F");
		list.tooString();
		list.add("G");

		//LIMPANDO ARRAY
		list.tooString();
		list.remove(0);
		assertTrue(list.remove("B"));
		assertTrue(list.remove("D"));
		assertTrue(list.remove("E"));
		assertTrue(list.remove("F"));
		assertTrue(list.remove("G"));
		list.tooString();
		////////////	
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0, "D");
		list.tooString();
		list.add("E");
		list.tooString();
		list.add("G");
		list.tooString();
		list.set(0, "F");
		list.tooString();

		
		
	}
}
