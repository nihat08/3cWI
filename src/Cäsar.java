public class Cäsar {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) ((ch - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(ch);

            }
        }
        return result.toString();
    }
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }
    public static void  main(String[] args) {
        String text = "Hello World!";
        int shift = 3;

        String encrypted = encrypt(text, shift);
        System.out.println("Verschlüsselt: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Entschlüsselt: " + decrypted);
    }
}
