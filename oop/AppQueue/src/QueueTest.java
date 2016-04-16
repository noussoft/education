import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class QueueTest {
	
	private Queue queue;

	@Before
	public void setUp() throws Exception {
//		this.queue = new ArrayQueue(5);
		this.queue = new ListQueue();
		
	}

	
	@Test
	public void testPush() {
		try {
			queue.push(new Integer(5));
			queue.push(new Integer(3));
			queue.push(new Integer(7));
			
			assertEquals(new Integer(5), queue.pop());
			
			queue.push(new Integer(9));
			queue.push(new Integer(10));
			
			assertEquals(new Integer(3), queue.pop());
			assertEquals(new Integer(7), queue.pop());
			assertEquals(new Integer(9), queue.pop());
			assertEquals(new Integer(10), queue.pop());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testFull() {
		try {
			queue.push(new Integer(5));
			queue.push(new Integer(3));
			queue.push(new Integer(7));
			queue.push(new Integer(8));
			queue.push(new Integer(9));
			queue.push(new Integer(10));
			
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Queue is full");
		}
	}
	
	@Test
	public void testEmpty() {
		try {
			queue.pop();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Queue is empty");
		}
	}
	
	@Test
	public void testPop() {
		try {
			queue.push(new Integer(5));
			queue.push(new Integer(3));
			queue.push(new Integer(7));
			
			assertEquals(new Integer(5), queue.pop());
		} catch (Exception e) {
			// nothing todo
		}
	}
	
	@Test
	public void testSize() {
		try {
			queue.push(new Integer(5));
			queue.push(new Integer(3));
			queue.push(new Integer(7));
		
			assertEquals(3, queue.size());
		} catch (Exception e) {
			// nothing todo
		}
	}

}
