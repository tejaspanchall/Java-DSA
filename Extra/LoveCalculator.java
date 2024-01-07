import java.util.*;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name1 = input.nextLine();

        System.out.print("Enter your parter's name: ");
        String name2 = input.nextLine();

        int loveScore = Math.abs(name1.hashCode() - name2.hashCode()) % 101;

        System.out.println("Love Score: " + loveScore + "%");
    }
}
