
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure[] figures = new Figure[5];
		
		figures[0] = new Circle(5);
		figures[1] = new Rectangle(10, 20);
		figures[2] = new Circle(10);
		figures[3] = new Rectangle(20, 20);
		figures[4] = new Circle(20);
		
		for (int i = 0; i < figures.length; i++) {
			System.out.println(figures[i].getSquare());
		}
	}

}
