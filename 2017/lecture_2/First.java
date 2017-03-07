
public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child john;
		
		john = new Child("John", "Doe", 123);
		
		Child anotherJohn = new Child("John", "Doe", 118);
		
		System.out.println(john);
		System.out.println(anotherJohn);
		
		if (john.equals(anotherJohn)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		
		
		

	}

}
