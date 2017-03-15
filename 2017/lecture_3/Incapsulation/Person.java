
public class Person {

	public final static int MIN_YEAR = 1950;
	public final static int MAX_YEAR = 1999;
	
	public 
	
	private String name;
	private int yearOfBirth;
	private int height;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void setYearOfBirth(int yearOfBirth) throws Exception {
		if (
			(yearOfBirth >= Person.MIN_YEAR)
			&& (yearOfBirth <= Person.MAX_YEAR)
		) {
			this.yearOfBirth = yearOfBirth;
		} else {
			throw new Exception("Invalid year of birth");
		}
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return this.name + " (" + this.yearOfBirth + ", " + this.height + ")"; 
	}
	
}
