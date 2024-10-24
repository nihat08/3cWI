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
        System.out.println(countLetters("andread", 'a'));
        //reverse
        String rev = revString("leined lol");

        //amount
        int amountOfLetters = getAmountOfLetters("fünf");
    }

    public static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }

    public static int countLetters(String word, char c) {
        int count = 0;
            for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static String revString(String word) {
        for (int i = word.length() -1; i>=0; i--) {
            System.out.print(word.charAt(i));

        }
        return word;
    }

    public static int getAmountOfLetters(String word) {
        int length = word.length();
        System.out.println(length);
        return length;
    }

    }

