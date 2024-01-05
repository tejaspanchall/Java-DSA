import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (((year % 100 != 0) || (year % 400 ==0)) && (year % 4 == 0)) {
            System.out.println("YAYY! It's a leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
    }
}