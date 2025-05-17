public class Palindrome_StringBuilderApproach {

    public static void main(String[] args){

        String word = "mom";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(word.contentEquals(sb) ? "Word is Palindrome" : "Not a Palindrome");
    }
}
