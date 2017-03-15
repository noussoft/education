
public class Circle extends Figure{
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getSquare() {
		
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	
}
