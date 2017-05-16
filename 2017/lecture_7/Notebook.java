import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Notebook{

	private ArrayList<Contact> contacts = new ArrayList<>();
	
	public void add(Contact contact) {
		this.contacts.add(contact);
	}
	
	public void show() {
		for (Contact contact : this.contacts) {
			System.out.println(contact);
		}
	}
	
	public static Notebook load(DataInputStream in) throws IOException {
		int size = in.readInt();
		Notebook result = new Notebook();
		for (int i = 0; i < size; i++) {
			result.add(Contact.load(in));
		}
		return result;
	}
	
	public void save(DataOutputStream out) throws IOException {
		out.writeInt(this.contacts.size());
		for (Contact contact : this.contacts) {
			contact.save(out);
		}
	}
}
