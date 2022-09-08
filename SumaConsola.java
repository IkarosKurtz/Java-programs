import java.util.Scanner;

public class SumaConsola {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Dame el primer valor");
		try {
			num1 = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Ingresa un numero valido");
		}

		System.out.println("Dame el segundo valor");
		try {
			num2 = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Ingresa un numero valido");
		}

		int results = num1 + num2;

		System.out.println("El resultado es " + results);
	}
}
