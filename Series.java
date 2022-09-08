public class Series {

	public static void main(String[] args) {
		System.out.print("Serie a) ");

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ", ");
		}

		System.out.print("\n");

		System.out.print("\nSerie b) ");

		int a = 99;
		int c = 1;
		int i = 0;
		boolean b = false;
		while (i < 10) {
			if (!b) {
				System.out.print(c + ", ");
				c++;
				b = true;
			} else {
				System.out.print(a + ", ");
				a--;
				b = false;
			}
			i++;
		}
		System.out.print("\n");

		System.out.print("\nSerie c) ");
		int lim = 11, serie = 0, aux = 1;
		i = 0;
		do {
			System.out.print(serie + ", ");
			aux += serie;
			serie = aux - serie;
			i++;
		} while (i <= lim);
	}
}
