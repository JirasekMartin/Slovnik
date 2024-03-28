import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slovnik {

    public static void main(String[] args) {

        Map<String, String> anglicky = new HashMap<>();
        Map<String, String> cesky = new HashMap<>();

        // Naplnění slovníků
        anglicky.put("cat", "kočka");
        anglicky.put("mouse", "myš");
        anglicky.put("computer", "počítač");

        // Inicializace českého slovníku z anglického
        for (Map.Entry<String, String> entry : anglicky.entrySet()) {
            cesky.put(entry.getValue(), entry.getKey());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadej slovo: ");
        String slovo = scanner.nextLine();

        if (anglicky.containsKey(slovo)) {
            System.out.println("Překlad: " + anglicky.get(slovo));
        } else if (cesky.containsKey(slovo)) {
            System.out.println("Překlad: " + cesky.get(slovo));
        } else {
            System.out.println("Takové slovíčko ve slovníku není.");
        }

        //Výpis slovníků
        System.out.println("Výpis anglického slovníku: ");
        for (Map.Entry<String, String> entry : anglicky.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Výpis českého slovníku: ");
        for (Map.Entry<String, String> entry : cesky.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}