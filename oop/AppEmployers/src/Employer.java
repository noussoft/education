
public class Employer {

	public static final int TAB_SIZE = 8;
	
	private static int id = 10000;
	private int ownId;
	private String firstName;
	private String lastName;
	private int birthYear;
	private int seniority;
	private double salary;
	private double extraSalary = 0;
	
	public Employer(
			String firstName, String lastName, int birthYear,
			int seniority, double salary
	) {
		super();
		this.ownId = id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.seniority = seniority;
		this.salary = salary;
	}
	
	public double getFullSalary() {
		double result = this.salary * Company.getExtraSeniority(this.seniority);
		
		return (this.extraSalary != 0) ? result + extraSalary : result; 
	}
	
	public String toString() {
		return
			ownId + "\t" + this.getFormattedFullName()
			+ "\t\t" + birthYear
			+ "\t\t" + seniority
			+ "\t\t" + salary
			+ "\t\t" + getFullSalary();
	}
	
	public Employer setExtraSalary(double extraSalary) {
		this.extraSalary = extraSalary;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getSeniority() {
		return seniority;
	}
	public double getSalary() {
		return salary;
	}
	
	private String getFormattedFullName() {
		if (this.firstName.length() < Employer.TAB_SIZE)
			return  firstName + "\t\t" + lastName;
		return firstName + "\t" + lastName;
	}
}
