import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Comparasion {

	public static void main(String[] args) {
		int num1 = Dialogue("Ingresa el primer numero");
		int num2 = Dialogue("Ingresa el segundo numero");

		// Filtros de comparación
		String results = "Resultados: \n";

		if (num1 == num2) results += num1 + " == " + num2; else results += num1 + " != " + num2;

		results += "\n";

		if (num1 > num2) results += num1 + " > " + num2; else results += num1 + " < " + num2;

		results += "\n";

		if (num1 >= num2) results += num1 + " >= " + num2; else results += num1 + " <= " + num2;

		Message(results);
	}

	// Metodo para mostrar el input dialogue
	public static int Dialogue(String text) {
		String value = JOptionPane.showInputDialog(null, text);

		// Evalúa si el input es un numero
		Pattern pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(value);

		// Si es una letra o palabra regresara un 0
		if (matcher.find()) return 0;

		int num = Integer.parseInt(value);
		return num;
	}

	// Metodo para mostrar un cuadro de dialogo
	public static void Message(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
}
