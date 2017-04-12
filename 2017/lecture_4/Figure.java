import java.awt.Graphics;


abstract public class Figure {

	abstract public void draw(Graphics g);
	
	abstract public double getSquare();
	
	public boolean equals(Object o) {
		if (this.getSquare() == ((Figure)o).getSquare())
			return true;
		return false;
	}
	
	
}
