public class GuessWords {
    public static void main(String[] args) {
        String s = "nihat";
        System.out.println(s.replaceAll(censorWords("nihat"), "*"));
    }
    public static String censorWords(String words){
        String result = "";
        for (String w: words)
            for (int i = 0; i < w.length(); i++) {
                result += String.format("|((?<=%s)%s(?=%s))"),
                w.substring(0, i), w.charAt(i),
                        w.substring(i + 1))
                return result.substring(1);

            }
    }
}
