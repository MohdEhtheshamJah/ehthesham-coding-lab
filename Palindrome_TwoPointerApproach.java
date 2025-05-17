/**
 *
 *  Two-pointer approach compares characters from both ends of the string, moving towards the center.
 */

public class Palindrome_TwoPointerApproach {

    public static void main(String[] args) {

        String word = "mom";

        int left = 0;
        int right = word.length()-1;
        boolean result = true;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                result = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(result ? word + " is Palindrome " : " Not a Palindrome ");

    }
}
