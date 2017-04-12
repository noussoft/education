
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(10, 10, 5);
		Circle c2 = new Circle(10, 10, 5);
		Circle c3 = new Circle(20, 20, 5);
		
		if (c1.equals(c2)) {
			System.out.println("c1 and c2 are equal");
		} else {
			System.out.println("c1 and c2 aren't equal");
		}
		
		if (c1.equals(c3)) {
			System.out.println("c1 and c3 are equal");
		} else {
			System.out.println("c1 and c3 aren't equal");
		}
	}

}
