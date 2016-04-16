
public class ArrayQueue implements Queue {
	
	private Object[] values;
	private int head;
	private int tail;
	private int count;

	public ArrayQueue(int size) {
		this.values = new Object[size];
		this.head = 0;
		this.tail = 0;
		this.count = 0;
	}
	
	@Override
	public void push(Object o) throws Exception {
		if (this.isFull()) {
			throw new Exception("Queue is full");
		} else {
			this.values[this.tail++] = o;
			this.count++;
			if (this.tail == this.values.length) {
				this.tail = 0;
			}
		}

	}

	@Override
	public Object pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		} else {
			Object result = this.values[this.head++];
			this.count--;
			if (this.head == this.values.length) {
				this.head = 0;
			}
			return result;
		}
	}

	@Override
	public int size() {
		return count;
	}
	
	private boolean isEmpty() {
		return 0 == this.count;
	}
	
	private boolean isFull() {
		return this.count == this.values.length;
	}

}
