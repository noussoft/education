import java.awt.Graphics;


public class Rectangle extends Figure {

	private int x, y;
	private int height, width;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);

	}

	@Override
	public double getSquare() {
		
		return this.width * this.height;
	}

}
