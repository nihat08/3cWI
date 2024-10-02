import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        //Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
        //        Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        //1. Einzahlen
        //2. Abheben
        //3. Kontostand
        //4. Beenden
        //sFolgendes Video zeigt dir die Funktionsweise
        Scanner scanner = new Scanner(System.in);


        int Kontostand = 0;
        System.out.println(Kontostand);
        boolean running = true;

        while (running) {
            // Menü anzeigen
            System.out.println("Willkommen beim Bankomat!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
        int auswahl = (scanner.nextInt());

        switch(auswahl) {
            case 1:
                System.out.println("Wie viel möchten Sie einzahlen?");
                int Einzahlen = scanner.nextInt();
                if (Einzahlen>0){
                    Kontostand+=Einzahlen;
                    System.out.println(Einzahlen + "€ wurden eingezahlt");
                }


        }
        }
    }
}
