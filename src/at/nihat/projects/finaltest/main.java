package at.nihat.projects.finaltest;

public class main {
    public static void main(String[] args) {
        // Objekt der finalen Klasse erstellen
        Unveraenderlich obj = new Unveraenderlich();
        obj.zeigeNachricht();

        // Final-Variable Beispiel
        final int zahl = 10;
        // zahl = 20; // Fehler! Wert kann nicht geändert werden
        System.out.println(zahl);
    }
}

