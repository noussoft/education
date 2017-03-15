
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Person john = new Person("John");
		try {
			john.setYearOfBirth(1988);
		} catch (Exception e) {
			System.out.print(e.toString());
		}
		john.setHeight(190);
		
		System.out.println(john);

	}

}
