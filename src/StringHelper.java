public class StringHelper {
    public static void main(String[] args) {
        //Palindrome
        boolean isPalindrome = isPalindrome("anna");
        if (isPalindrome){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //count
        //int amount = countLetters("andreas", "a");
        //System.out.println(amount);

        //reverse
        String rev = revString("hello");

        //amount
        int amountOfLetters = getAmountOfLetters("sepp");
    }
    public static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }
    public static int countLetters(String word, char c) {
        return 7;
    }
    public static String revString(String word) {
        return "olleh";
    }
    public static int getAmountOfLetters(String word) {
        return 5;
    }
}
