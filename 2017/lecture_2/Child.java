
public class Child {
	
	private String firstName;
	private String lastName;
	
	private int height;
	
	public Child(String firstName, String lastName, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public boolean equals(Object obj) {
		if (
			this.height == ((Child)obj).getHeight()
		) {
			return true;
		}
		return false;	
	}

}
