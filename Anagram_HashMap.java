import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Anagram_HashMap {

    public static void main(String[] args) {

        String word1 = "silent";
        String word2 = "listen";

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }

        System.out.println(hm1.equals(hm2) ? "Anagram" : "Not Anagram");

    }
}
