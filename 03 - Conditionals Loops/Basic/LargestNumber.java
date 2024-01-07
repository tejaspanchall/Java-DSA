package Basic;
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;

        while (true) {
            System.out.print("Enter the number(enter 0 to stop): ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num > largest) {
                largest = num;
            }

        }
        
        if (largest == 0) {
            System.out.println("No numbers were entered");
        } else {
            System.out.println("Largest entered numbers are: " + largest);
        }
    }
}
