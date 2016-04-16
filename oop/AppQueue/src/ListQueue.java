
public class ListQueue implements Queue{

	private ListElement head;
	private ListElement tail;
	private int size;
	
	public ListQueue() {
		this.size = 0;
		this.head = this.tail = null;
	}
	
	@Override
	public void push(Object value) throws Exception {
		
		ListElement le = new ListElement(value, null);
		
		if (0 == this.size) {
			this.head = le;
		} else {
			this.tail.setNext(le);
			
		}
		this.tail = le;
		this.size++;
		
	}
	@Override
	public Object pop() throws Exception {
		if (0 == this.size) {
			throw new Exception("Queue is empty");
		} else {
			Object result = head.getValue();
			head = head.getNext();
			this.size--;
			return result;
		}
	}
	@Override
	public int size() {
		return this.size;
	}
	
	
}
