import java.awt.Graphics;
import javax.swing.JFrame;

public class grafico extends JFrame {

	public void paint(Graphics g) {
		super.paint(g);
		int y = 10;
		int x = 500;
		for (int i = 0; i < 50; i++) {
			g.drawLine(0, 0, x, y);
			g.drawLine(500, 500, y, x);
			g.drawLine(0, 500, y, y);
			g.drawLine(500, 0, y, y);
			y = y + 10;
			x = x - 10;
		}
	}

	public static void main(String[] args) {
		grafico a = new grafico();
		a.setSize(500, 500);
		a.setVisible(true);
	}
}
