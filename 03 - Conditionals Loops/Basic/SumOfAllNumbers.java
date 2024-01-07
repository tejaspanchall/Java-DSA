package Basic;
import java.util.*;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter the number(enter 0 to stop): ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            sum = sum + num;
        }
        System.out.println("Sum of the entered numbers are: " + sum);
    }
}
