package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	Stack s1;

	protected void setUp() throws Exception {
		super.setUp();
		s1 = new Stack();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		s1 = new Stack();
	}

	public void testCreateNewEmptyStack() {
		int stackSize = s1.getSize();
		assertEquals(5, stackSize);
		assertTrue("Stack is not empty", s1.isEmpty());
	}

	public void testPushNewElement() {
		Object pushData = 1;
		s1.push(pushData);
		assertEquals(5, s1.getSize());
		assertEquals(1, s1.getTop());
		assertEquals(5, s1.getSize());
		pushData = 2;
		s1.push(pushData);
		assertEquals(5, s1.getSize());
		assertEquals(2, s1.getTop());
	}

	public void testMaxStack() {
		assertTrue(s1.isEmpty());
		assertEquals(5, s1.getSize());
		assertEquals(0, s1.getCount());
		for (int i = 0; i < 5; i++) {
			s1.push(i);
		}
		assertEquals(5, s1.getSize());
		assertEquals(5, s1.getCount());
		assertTrue(s1.isFull());
		try {
			s1.push(1);
		} catch (Exception e) {
			assertEquals(5, s1.getSize());
			assertEquals(5, s1.getCount());
			assertEquals(4, s1.getTop());
		}
	}
	public void testLastInFirstOut() {
		assertTrue(s1.isEmpty());
		for (int i = 0; i < 5; i++) {
			s1.push(i);
			assertEquals(i, s1.getTop());
		}
		assertTrue(s1.isFull());
		for (int i = 4; i >= 0; i--) {
			assertEquals(i, s1.pop());
		}
		assertTrue(s1.isEmpty());		
	}

}
