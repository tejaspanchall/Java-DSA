import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fitst number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number: " + num1);
        }
        else {
            System.out.println("Largest number: " + num2);
        }
    }
}