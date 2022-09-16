public class List {

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

		return this.stock[--this.index];
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
