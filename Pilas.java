import java.util.Scanner;

public class Pilas {

	public static void main(String[] args) {
		List list = new List(5);
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("\n\n1. Insert\n2. Delete\n3. Print\n4. More\n5. Exit");
			System.out.println("\nEnter your choice");
			option = scanner.nextInt();

			switch (option) {
				case 1:
					System.out.println("\nEnter the element to insert");
					list.Push(scanner.next().charAt(0));
					break;
				case 2:
					System.out.println("\nElement deleted: " + list.Pop());
					break;
				case 3:
					System.out.println("Printing the list");
					for (int i = 0; i < list.length(); i++) System.out.print(list.Peek(i) + ", ");
					break;
				case 4:
					System.out.println("\nIs empty: " + list.isEmpty());
					break;
				case 5:
					option = 5;
					break;
				default:
					System.out.println("\nInvalid Input");
					break;
			}
		} while (option != 5);
	}

	public static class List {

		private char stock[];
		private int index;

		public List(int size) {
			this.stock = new char[size];
			this.index = 0;
		}

		public void Push(char dato) {
			if (this.index >= this.stock.length) {
				ExceptionCached("Error: list is totally full");

				return;
			}

			this.stock[this.index] = dato;
			this.index++;
		}

		public char Pop() {
			if (this.index <= 0) {
				ExceptionCached("Error: list is empty");
				return '0';
			}
			char deleted = this.stock[this.index];
			this.stock[this.index] = 0;

			this.index--;
			return deleted;
		}

		public char Peek(int index) {
			if (this.index <= 0) {
				ExceptionCached("Error: list is empty");
				return '0';
			}
			return this.stock[index];
		}

		public boolean isEmpty() {
			return this.stock.length == 0;
		}

		public int length() {
			return this.stock.length;
		}

		private void ExceptionCached(String error) {
			System.out.println(error);
		}
	}
}
