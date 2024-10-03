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


        int balance = 0;
        System.out.println(balance);
        boolean running = true;

        while (true) {
            // Menü anzeigen
            System.out.println("Guten Tag!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
        int auswahl = (scanner.nextInt());

        switch(auswahl) {
            case 1:
                System.out.println("Wie viel € möchten Sie einzahlen?");
                int deposit = scanner.nextInt();
                if (deposit >0){
                    balance += deposit;
                    System.out.println(deposit + "€ wurden eingezahlt");
                }
                break;
            case 2:
                System.out.println("Wie viel € möchten Sie abheben?");
                int withdraw = scanner.nextInt();
                if (withdraw> balance){
                    System.out.println("Kontostand zu niedrig");
                }else if (withdraw>0){
                    balance -= withdraw;
                    System.out.println(withdraw + "€ wurden abgehoben");
                }
                break;
            case 3:
                System.out.println("Sie haben " + balance + "€ auf dem Konto");
                break;
            case 4:



        }
        }
    }
}
