package Assignment2;

public class StringAssignment {

    // Count vowels
    public int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Count consonants
    public int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        return count;
    }

    // Check palindrome
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

    // Replace word
    public String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}

