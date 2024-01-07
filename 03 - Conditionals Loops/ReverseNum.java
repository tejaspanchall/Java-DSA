import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.err.println(ans);
    }
}
