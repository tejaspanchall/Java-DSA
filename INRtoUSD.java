import java.util.*;

public class INRtoUSD {
    public static void main(String[] args) {
        int inr, usd;
        Scanner input = new Scanner(System.in);
        System.out.println("<< INR to USD Converter >>");
        System.out.print("Enter amount in ruppes: ");
        inr = input.nextInt();

        usd = inr / 82;
        System.out.println("Your amount in USD: $" + usd);
    }
}