import java.awt.Graphics;
import javax.swing.JFrame;

public class grafico extends JFrame {

	public void paint(Graphics g) {
		super.paint(g);
		int y = 10;
		int x = 200;

		for (int i = 0; i < 20; i++) {
			g.drawLine(0, 0, x, y);
			x = x - 10;
			y = y + 10;
		}
	}

	public static void main(String[] args) {
		grafico a = new grafico();
		a.setSize(1000, 1000);
		a.setVisible(true);
	}
}
