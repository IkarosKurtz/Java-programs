import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vacaciones {

	public static void main(String[] args) {
		List<Trabajador> dataBase = new ArrayList<Trabajador>();

		JTextField nombre = new JTextField(6);
		JTextField clave = new JTextField(6);
		JTextField antiguedad = new JTextField(3);

		JPanel p = new JPanel();
		p.add(new JLabel("Nombre: "));
		p.add(nombre);
		p.add(new JLabel("Clave del departamento: "));
		p.add(clave);
		p.add(new JLabel("Antiguedad: "));
		p.add(antiguedad);

		for (int i = 0; i < 3; i++) {
			int value = 0;
			Print(p);

			try {
				value = Integer.parseInt(antiguedad.getText());
			} catch (Exception e) {}

			dataBase.add(new Trabajador(nombre.getText(), clave.getText(), value));
			nombre.setText("");
			clave.setText("");
			antiguedad.setText("");
		}

		for (Trabajador trabajador : dataBase) {
			Print(trabajador.Vacaciones());
		}
	}

	public static void Print(String message) {
		JOptionPane.showMessageDialog(null, message, "Vacaciones", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Print(JPanel panel) {
		JOptionPane.showMessageDialog(null, panel, "Vacaciones", JOptionPane.INFORMATION_MESSAGE);
	}

	public static class Trabajador {

		String claveDepartamento;
		String nombre;
		int antiguedad;

		public Trabajador(String nombre, String claveDepartamento, int antiguedad) {
			this.claveDepartamento = claveDepartamento;
			this.nombre = nombre;
			this.antiguedad = antiguedad;
		}

		public String Vacaciones() {
			String msg = "";

			switch (this.claveDepartamento) {
				case "1":
					if (this.antiguedad == 1) {
						msg = Message(6);
					} else if (this.antiguedad > 1 && this.antiguedad <= 6) {
						msg = Message(14);
					} else if (this.antiguedad > 6) {
						msg = Message(20);
					}

					break;
				case "2":
					if (this.antiguedad == 1) {
						msg = Message(7);
					} else if (this.antiguedad > 1 && this.antiguedad <= 6) {
						msg = Message(15);
					} else if (this.antiguedad > 6) {
						msg = Message(22);
					}

					break;
				case "3":
					if (this.antiguedad == 1) {
						msg = Message(10);
					} else if (this.antiguedad > 1 && this.antiguedad <= 6) {
						msg = Message(20);
					} else if (this.antiguedad > 6) {
						msg = Message(30);
					}

					break;
				default:
					msg = "Lo siento " + this.nombre + " la clave que se a establecido no existe.";

					break;
			}
			return msg;
		}

		private String Message(int vacaciones) {
			String msg =
				this.nombre +
				" clave " +
				this.claveDepartamento +
				", tiene " +
				this.antiguedad +
				" años de servicio\n" +
				"Merece " +
				vacaciones +
				" días de vacaciones.";

			return msg;
		}
	}
}
