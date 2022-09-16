package examen;

import java.util.Scanner;

/*
 Carlos Leonardo Cruz Ortiz Id: 261696
 */
public class Listas {

	public static void main(String[] args) {
		Lista list = new Lista();
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("\n\n1. Insertar\n2. Imprimir\n3. Salir");
			System.out.println("\n-->");
			option = scanner.nextInt();

			switch (option) {
				case 1:
					System.out.println("\nInserte el elemento para agregarlo");
					list.insertaNodoFinal(scanner.next().charAt(0));

					break;
				case 2:
					System.out.println("Imprimiendo Lista");
					list.imprimeLista();

					break;
				case 3:
					option = 3;
					break;
				default:
					System.out.println("\nOpción invalida");
					break;
			}
		} while (option != 3);
	}

	public static class Lista {

		private Nodo firstNodo, lastNodo;

		public Lista() {
			firstNodo = lastNodo = null;
		}

		public void insertaNodoFinal(char dato) {
			if (firstNodo == null) {
				lastNodo = new Nodo();
				lastNodo.data = dato;
				firstNodo = lastNodo;
			} else {
				Nodo aux = new Nodo();
				aux.data = dato;
				lastNodo.next = aux;

				lastNodo = aux;
				aux = null;
			}
		}

		public void imprimeLista() {
			Nodo aux;
			String lista = "";
			aux = firstNodo;
			while (aux != null) {
				lista += aux.data + ", ";
				aux = aux.next;
			}
			System.out.print('{');
			System.out.print(lista.substring(0, lista.length() - 2));
			System.out.print('}');
		}
	}

	public static class Nodo {

		private char data;
		private Nodo next;

		public Nodo() {
			data = 0;
			next = null;
		}
	}
}
