package Java_150;

import java.util.Scanner;

public class Vowels_Consonanat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int vowel = 0, consonant = 0;
        String vowels = "aeiouAEIOU";

        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) 
            { 
                if (vowels.indexOf(ch) != -1) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        // Display the results
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
