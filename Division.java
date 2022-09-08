import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		boolean done = false;

		Print("Ingresa el primer valor: ");
		do {
			try {
				num1 = Integer.parseInt(input.nextLine());
				done = true;
			} catch (Exception e) {
				System.out.println("Hubo un error intente de nuevo");
			}
		} while (!done);

		done = false;

		Print("Ingresa el segundo valor: ");
		do {
			try {
				num2 = Integer.parseInt(input.nextLine());
				done = true;
			} catch (Exception e) {
				System.out.println("Hubo un error intente de nuevo");
			}
		} while (!done);

		int results = (num1 + num2) / 2;

		Print("El resultado es: " + results);
	}

	public static void Print(String text) {
		System.out.println(text);
	}
}
