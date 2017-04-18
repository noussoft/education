import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Notebook {

	private List<Contact> contacts;
	
	public Notebook() {
		contacts = new ArrayList<Contact>();
	}
	
	public void add(Contact contact) {
		this.contacts.add(contact);
	}
	
	public void add(String firstName, String lastName, String phone) {
		this.contacts.add(new Contact(firstName, lastName, phone));
	}
	
	public void show() {
		int count = 0;
		Iterator<Contact> iterator = this.contacts.iterator();
		while (iterator.hasNext()) {
			count++;
			System.out.println(count + ". " + iterator.next());
		}
	}
}
