import java.util.Arrays;

public class Anagram_SortingBasedTechnique {

    public static void main(String[] args) {

        String word1 = "silent";
        String word2 = "listen";

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        System.out.println(Arrays.equals(word1Arr, word2Arr) ? "Anagram" : "Not Anagram");
    }


}
