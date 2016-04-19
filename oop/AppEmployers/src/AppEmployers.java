
public class AppEmployers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Company company = new Company();
		company.
			add(new Employer("Ivanov", "Sergey", 1970, 22, 20000)).
			add(new Employer("Petrov", "Aleksey", 1980, 3, 20000)).
			add(new Employer("Sidorov", "Andrey", 1983, 7, 18000).setExtraSalary(3000)).
			add(new Employer("Mikhailov", "Sergey", 1975, 21, 38000).setExtraSalary(10000)).
			add(new Employer("Vetkin", "Igor", 1990, 2, 15000));

//		company.showByFirstName();
//		company.showByBirthYear();
		company.showByFullSalary();
	}
	
	

}
