package at.nihat.projects.finaltest;
// Eine finale Klasse kann nicht erweitert werden
final class Unveraenderlich {
    // Eine finale Variable kann nur einmal zugewiesen werden
    private final String nachricht = "Hallo, ich bin final!";

    // Eine finale Methode kann nicht überschrieben werden
    public final void zeigeNachricht() {
        System.out.println(nachricht);
    }
}
