package examen;

import java.util.Scanner;

/*
 Carlos Leonardo Cruz Ortiz Id: 261696
 */
public class Filas {

	public static void main(String[] args) {
		Fila list = new Fila(6);
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		final char defaultValue = '█';

		do {
			System.out.println(
				"\n\n1. Insertar\n2. Borrar\n3. Imprimir\n4. Esta vacía?\n5. Capacidad\n6. Cantidad de datos\n7. Esta llena?\n8. Salir"
			);
			System.out.println("\n-->");
			option = scanner.nextInt();

			switch (option) {
				case 1:
					System.out.println("\nInserte el elemento para agregarlo");
					list.meterDatosFila(scanner.next().charAt(0));

					break;
				case 2:
					System.out.println("\nElemento eliminado: " + list.sacarDatosFila());

					break;
				case 3:
					if (list.numObjetos() != 0) {
						System.out.println("Imprimiendo fila");
						String fila = "";

						for (int i = 0; i < list.capacidadFila(); i++) {
							char dato = list.Peek(i);

							if (dato != defaultValue) {
								fila += dato + ", ";
							}
						}

						System.out.print('{');
						System.out.print(fila.substring(0, fila.length() - 2));
						System.out.print('}');
					} else {
						System.out.println("No hay datos por imprimir");
					}
					break;
				case 4:
					System.out.println("\nEsta vacía: " + (list.filaVacia() ? "Si" : "No"));
					break;
				case 5:
					System.out.println("\n La capacidad de la fila: " + list.capacidadFila());
					break;
				case 6:
					System.out.println("\n La cantidad de la fila es: " + list.numObjetos());
					break;
				case 7:
					System.out.println("\nEsta llena: " + (list.filaLlena() ? "Si" : "No"));
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

	public static class Fila {

		private char stock[], backup[];
		private int index, index2 = 0;
		final char defaultValue = '█';

		public Fila(int size) {
			stock = new char[size];
			backup = new char[size];
			index = 0;

			for (int i = 0; i < stock.length; i++) {
				stock[i] = defaultValue;
				backup[i] = defaultValue;
			}
		}

		public void meterDatosFila(char dato) {
			if (index >= stock.length) {
				ExceptionCached("Error: fila llena.");
				return;
			}
			Ordenar();

			stock[index++] = dato;
			index2 = 0;
		}

		private void Ordenar() {
			int k = 0;
			for (int i = 0; i < stock.length; i++) {
				if (stock[i] != defaultValue) {
					backup[k++] = stock[i];
				}
			}
			stock = backup;
			index = k;
		}

		public char sacarDatosFila() {
			if (index < 0) {
				return defaultValue;
			}

			char aux = stock[index2];
			stock[index2] = defaultValue;
			index--;
			index2++;
			return aux;
		}

		public boolean filaVacia() {
			int cantidad = numObjetos();
			return cantidad <= 0;
		}

		public boolean filaLlena() {
			int cantidad = numObjetos();
			return cantidad >= stock.length;
		}

		public int capacidadFila() {
			return stock.length;
		}

		public int numObjetos() {
			return index;
		}

		public char Peek(int index) {
			if (stock[index] == '\u0000' || stock[index] == defaultValue) {
				return defaultValue;
			}
			return stock[index];
		}

		private void ExceptionCached(String error) {
			System.out.println(error);
		}
	}
}
