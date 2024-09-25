import java.util.Random;

public class While_01 {
    public static void main(String[] args) {
        // Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet
        // und die Summe der vorherigen Zufallszahlen ausgegeben!
        boolean fertig = false;
        int sum = 0;
        Random random = new Random();
        while (!fertig) {
            int randomNumber = random.nextInt(10, 31);
            if (randomNumber==15||randomNumber==25) {
                fertig = true;
            sum+=randomNumber;
            }
            System.out.println(randomNumber);

        }
        System.out.println("Summe = "+sum);
    }
}
