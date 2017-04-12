import java.awt.Graphics;


public class Circle extends Figure {

	private int x, y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);

	}

	@Override
	public double getSquare() {
		
		return Math.PI * Math.pow(this.radius, 2);
	}
} 