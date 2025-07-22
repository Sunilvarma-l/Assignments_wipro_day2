package StringAssignment;
import java.util.Scanner;

public class StringAssignmentApp {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringUtility util = new StringUtility();
		
		System.out.println("enter a string:");
		String inputString = sc.nextLine();
		
		int choice;
		do {
			System.out.println("\n===== String Operations Menu =====");
            System.out.println("1. Count Vowels");
            System.out.println("2. Count Consonants");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Reverse String");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Replace Word");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                int vowelCount = util.countVowels(inputString);
                System.out.println("Number of vowels: " + vowelCount);
                break;
            case 2:
                int consonantCount = util.countConsonants(inputString);
                System.out.println("Number of consonants: " + consonantCount);
                break;
            case 3:
                if (util.isPalindrome(inputString)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
                break;
            case 4:
                String reversed = util.reverseString(inputString);
                System.out.println("Reversed string: " + reversed);
                break;
            case 5:
                System.out.println("Uppercase: " + util.toUpperCase(inputString));
                break;
            case 6:
                System.out.println("Lowercase: " + util.toLowerCase(inputString));
                break;
            case 7:
                System.out.print("Enter word to replace: ");
                String oldWord = sc.nextLine();
                System.out.print("Enter new word: ");
                String newWord = sc.nextLine();
                inputString = util.replaceWord(inputString, oldWord, newWord);
                System.out.println("Updated string: " + inputString);
                break;
            case 8:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
            }
            	
		} while  (choice != 8);
		
		sc.close();
		
	

	}

}
