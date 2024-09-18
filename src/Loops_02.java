public class Loops_02 {
    public static void main(String[] args) {
        // Zähle die geraden Ziffern zwischen 1 und 1000 zusammen -
        // Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
        int sum = 0;
        for (int i = 2; i <= 1000 ; i+=2) {
            System.out.println("i = " + i);
            sum+=i;
        }
        System.out.println("Summe = " + sum);
    }
}
