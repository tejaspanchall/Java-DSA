package Intermediate;
import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an alphabet: ");
            char ch = input.next().charAt(0);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            }
            else {
                System.out.println("Invalid input. Please enter a valid letter.");
            }
        }
    }
}
