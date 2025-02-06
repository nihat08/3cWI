package at.nihat.projects.finaltest;

public class main {
    public static void main(String[] args) {
        // Objekt der finalen Klasse erstellen
        Unveraenderlich obj = new Unveraenderlich();
        obj.zeigeNachricht();

        // Final-Variable Beispiel
        final int zahl = 10;
        // zahl = 20; // Fehler! Wert kann nicht geändert werden

        // Final-Referenz Beispiel
        final StringBuilder builder = new StringBuilder("Hallo");
        builder.append(" Welt!"); // Erlaubt, weil das Objekt selbst nicht final ist
        System.out.println(builder);

        // builder = new StringBuilder("Neu"); // Fehler! Referenz kann nicht geändert werden
    }
}

