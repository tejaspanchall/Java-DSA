package Intermediate;
import java.util.*;

public class EvenDaysInAugust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in August: ");
        int daysInAugust = scanner.nextInt();

        int evenDaysCount = 0;
        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        System.out.println("Tejas can go out on " + evenDaysCount + " even days in August.");
    }
}
    