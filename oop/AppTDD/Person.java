
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getAgeAsString() {
		return this.age + " years old";
	}

}
