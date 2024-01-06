import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = input.nextLine();

        if (isPalindrome(name)) {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll(str, str).toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}