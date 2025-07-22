package StringAssignment;

public class StringUtility {

    // Count number of vowels in the string
    public int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Count number of consonants in the string
    public int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }

    // Check if the string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Reverse the string
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Convert to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Convert to lowercase
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // Replace a word in the string
    public String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}
