import java.util.*;

public class SimpleIntrest {
    public static void main(String[] args) {
        int p, r, t;
        Scanner input = new Scanner(System.in);

        System.out.println("<< Simple Intrest Calculator >>");
        System.out.print("Enter the principle amount: ");
        p = input.nextInt();

        System.out.print("Enter rate per annum: ");
        r = input.nextInt();

        System.out.print("Enter time: ");
        t = input.nextInt();

        int sum = (p * r * t) / 100;

        System.out.println("Your intrest is: " + sum);
    }
}