
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class Contact{
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String firstName, String lastName, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public static Contact load(DataInputStream in) throws IOException {
		String firstName = in.readUTF();
		String lastName = in.readUTF();
		String phone = in.readUTF();
//		String address = in.readUTF();
//		Contact contact = new Contact(firstName, lastName, phone);
//		contact.setAddress(address);
		return new Contact(firstName, lastName, phone);
	}
	
	public void save(DataOutputStream out) throws IOException {
		out.writeUTF(this.firstName);
		out.writeUTF(this.lastName);
		out.writeUTF(this.phone);
//		out.writeUTF(this.address);
	}
	
	
	
	public String toString() {
		return firstName + " " + lastName + ": " + phone;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean equals(Object o) {
		return
			(
				(this.getFirstName().equals(((Contact)o).getFirstName()))
				&& (this.getLastName().equals(((Contact)o).getLastName()))
				&& (this.getPhone().equals(((Contact)o).getPhone()))
			);
	}

}