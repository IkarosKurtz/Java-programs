import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class menu {
	public static void main(String[] args) {
		File file = new File(".");
        List<String> commandsAvailable = new ArrayList<String>();
        List<String> commandsUnavailable = new ArrayList<String>();

		String[] lista = file.list();


		for (String string : lista) {
			if (string.endsWith(".java")) {
                boolean isAvaible = false;
				for (String string2 : lista) {
                    if(string2.endsWith(".class") && string2.startsWith(string.split("\\.")[0]))
                    {
                        commandsAvailable.add(string.split("\\.")[0]);
                        isAvaible = true;
                        break;
                    }
                }

                if(!isAvaible)
                    commandsUnavailable.add(string.split("\\.")[0]);
			}
		}
        System.out.println("-------------------------------------------------------");
        System.out.printf("|%1s%-15s%10s|%1s%-15s%10s|%n", "","Compilados", "","", "No compilados", "");
        System.out.println("-------------------------------------------------------");

        int length = commandsAvailable.size() >= commandsUnavailable.size() ? commandsAvailable.size() : commandsUnavailable.size();

        for(int i = 1; i <= length; i++) {
            System.out.printf("|%1s%-15s%10s|%1s%-15s%10s|%n", "" ,commandsAvailable.size() < i ? "" : commandsAvailable.get(i - 1), "" , "",commandsUnavailable.size() < i ? "" : commandsUnavailable.get(i - 1), "");
        }
        System.out.println("-------------------------------------------------------");
	}

    public static void Print(String text) {
		System.out.println(text);
	}
}
