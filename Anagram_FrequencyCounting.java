/**
 *
 * The frequency counting technique is a problem-solving strategy where you
 * count how many times each element (character, number, etc.)
 * appears in a data structure (like a string or array).
 *
 * You typically use:
 * A HashMap (for dynamic or varied input)
 * A fixed-size array (for known character ranges like a-z)
 */


public class Anagram_FrequencyCounting {

    public static void main(String[] args) {

        String word1 = "silent";
        String word2 = "listen";

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[26];

        for(int i=0; i<word1.length();i++){
            freq[word1.charAt(i) - 'a']++;
            freq[word2.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count != 0){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
