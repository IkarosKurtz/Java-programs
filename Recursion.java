import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecciona un numero n ");
		int n = scanner.nextInt();
		System.out.println("Selecciona una operacion");
		System.out.println("1- Imprimir n veces hello world");
		System.out.println("2- Sacar el factorial de n");
		int op = scanner.nextInt();

		if (op == 1) {
			HelloWorld.PrintHelloWorld(n);
		} else {
			int fact = Factorial.PrintFactorial(n);
			System.out.println("El factorial de " + n + " es " + fact);
		}
	}

	public static class HelloWorld {

		public static void PrintHelloWorld(int n) {
			if (n < 1) return;

			System.out.println("Hello World");
			PrintHelloWorld(n - 1);
		}
	}

	public static class Factorial {

		public static int PrintFactorial(int n) {
			if (n == 0) return 1;

			return (n * PrintFactorial(n - 1));
		}
	}
}
