
public class ListElement {

	private Object value;
	private ListElement next;
	
	public ListElement(Object value, ListElement next) {
		this.value = value;
		this.next = next;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	public ListElement getNext() {
		return this.next;
	}
	
	public void setNext(ListElement next) {
		this.next = next;
	}
}
