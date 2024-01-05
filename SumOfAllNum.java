import java.util.*;

public class SumOfAllNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter number (Enter 'x' to finish)");

        while (input.hasNextInt()) {
            sum += input.nextInt();
        }

        System.out.println("Sum of all entered numbers: " + sum);
    }
}