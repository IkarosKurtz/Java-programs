import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Print("1- Suma\n2- Resta\n3- Multiplicación\n4- Division");

		int option = 0, res = 0, num1 = 0, num2 = 0;

		option = Data("Que quieres hacer? ", scanner);

		if (option > 5) System.exit(04);
		num1 = Data("Dame el primer valor ", scanner);
		num2 = Data("Dame el segundo valor ", scanner);

		switch (option) {
			case 1:
				res = num1 + num2;
				break;
			case 2:
				res = num1 - num2;
				break;
			case 3:
				res = num1 * num2;
				break;
			case 4:
				try {
					res = num1 / num2;
				} catch (Exception e) {
					Print("No se divide por cero");
				}
				break;
			default:
				break;
		}

		Print("El resultado es: " + res);
	}

	public static int Data(String text, Scanner scanner) {
		boolean done = false;
		int num = 0;

		do {
			try {
				Print(text);
				num = Integer.parseInt(scanner.nextLine());
				done = true;
			} catch (Exception e) {
				Print("Hubo un error intente de nuevo.");
			}
		} while (!done);

		return num;
	}

	public static void Print(String text) {
		System.out.println(text);
	}
}
