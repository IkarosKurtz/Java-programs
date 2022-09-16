package examen;

import java.util.Scanner;

/*
 Carlos Leonardo Cruz Ortiz Id: 261696
 */
public class Pilas {

	public static void main(String[] args) {
		Pila list = new Pila(6);
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		final char defaultValue = '█';

		do {
			System.out.println(
				"\n1. Insertar\n2. Borrar\n3. Imprimir\n4. Esta vacía?\n5. Capacidad\n6. Cantidad de datos\n7. Esta llena?\n8. Salir"
			);
			System.out.println("\n-->");
			option = scanner.nextInt();

			switch (option) {
				case 1:
					System.out.println("\nInserte el elemento para agregarlo");
					list.Push(scanner.next().charAt(0));

					break;
				case 2:
					System.out.println("\nElemento eliminado: " + list.Pop());

					break;
				case 3:
					if (list.numObjetos() != 0) {
						System.out.println("Imprimiendo pila");
						String pila = "";

						for (int i = list.numObjetos(); i >= 0; i--) {
							char dato = list.Peek(i);

							if (dato != defaultValue) {
								pila += dato + ", ";
							}
						}
						System.out.print('{');
						System.out.print(pila.substring(0, pila.length() - 2));
						System.out.print('}');
					} else {
						System.out.println("No hay datos por imprimir");
					}
					break;
				case 4:
					System.out.println("\nEsta vacía: " + (list.Vacia() ? "Si" : "No"));
					break;
				case 5:
					System.out.println("\n La capacidad de la pila: " + list.Capacidad());
					break;
				case 6:
					System.out.println("\n La cantidad de la pila es: " + list.numObjetos());
					break;
				case 7:
					System.out.println("\nEsta llena: " + (list.Llena() ? "Si" : "No"));
					break;
				case 8:
					option = 8;
					break;
				default:
					System.out.println("\nOpción invalida");
					break;
			}
		} while (option != 8);
	}

	public static class Pila {

		private char stock[];
		private int index;
		final char defaultValue = '█';

		public Pila(int size) {
			this.stock = new char[size];
			this.index = -1;
		}

		public void Push(char dato) {
			if (this.index >= this.stock.length) {
				ExceptionCached("Error: pila llena.");
				return;
			}
			this.stock[++this.index] = dato;
		}

		public char Pop() {
			if (this.index < 0) {
				return this.defaultValue;
			}

			char aux = this.stock[this.index];
			this.stock[this.index] = this.defaultValue;
			this.index = this.index - 1;
			return aux;
		}

		public boolean Vacia() {
			int cantidad = numObjetos();
			return cantidad <= 0;
		}

		public boolean Llena() {
			int cantidad = numObjetos();
			return cantidad >= this.stock.length;
		}

		public int Capacidad() {
			return this.stock.length;
		}

		public int numObjetos() {
			return this.index + 1;
		}

		public char Peek(int index) {
			if (this.stock[index] == '\u0000') {
				return this.defaultValue;
			}
			return this.stock[index];
		}

		private void ExceptionCached(String error) {
			System.out.println(error);
		}
	}
}
