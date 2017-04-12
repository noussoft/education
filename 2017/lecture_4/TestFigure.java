import java.applet.Applet;
import java.awt.Graphics;


public class TestFigure extends Applet {

	public void paint(Graphics g) {
		
		Figure[] figures = new Figure[5];
		figures[0] = new Line(10, 10, 40, 10);
		figures[1] = new Circle(100, 100, 50);
		figures[2] = new Circle(150, 150, 30);
		figures[3] = new Rectangle(200, 200, 250, 300);
		
		for (int i = 0; i < figures.length; i++) {
			if (figures[i] != null) {
				figures[i].draw(g);
			}
		}
		
	}
}
