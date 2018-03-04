package palindrome;

public class Palindrome {
    public static boolean checkIfPalindrome(String word){
        StringBuilder wordInput = new StringBuilder();
        StringBuilder wordInputRevert = new StringBuilder();
        boolean isPalindrome = false;
        for (int i = 0; i < word.length(); i++) {
            wordInput.append(word.charAt(i));
        }
        for (int i = word.length() - 1 ; i >= 0 ; i--) {
            wordInputRevert.append(word.charAt(i));
        }
        System.out.println(wordInput.toString());
        System.out.println(wordInputRevert.toString());
        if(wordInput.toString().equals(wordInputRevert.toString())){
            isPalindrome = true;
        }
        if(isPalindrome){
            System.out.println(word + " is palindrome");
            return true;
        }else{
            System.out.println(word + " is not palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        checkIfPalindrome("ala");
        checkIfPalindrome("kamilslimak");
        checkIfPalindrome("notpalindrome");
    }
}
