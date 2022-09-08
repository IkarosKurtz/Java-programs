public class Promedio {

	public static void main(String[] args) {
		int mat = 5, bio = 8, qui = 7;

		int promedio = (mat + bio + qui) / 3;

		if (promedio > 6) Print("Aprobaste con " + promedio); else Print("Reprobaste con " + promedio);
	}

	public static void Print(String text) {
		System.out.println(text);
	}
}
