package Intermediate;
import java.util.*;

public class SumOfNPEPONum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int neg = 0;
        int posEven = 0;
        int posOdd = 0;

        while (true) {
            System.out.print("Enter the number(enter 0 to stop): ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                neg += num;
            }
            else if (num % 2 == 0) {
                posEven += num;
            }
            else {
                posOdd += num;
            }
        }

        System.out.println("Sum of the negative numbers are: " + neg);
        System.out.println("Sum of the positive even numbers are: " + posEven);
        System.out.println("Sum of the positive odd numbers are: " + posOdd);
    }
}
