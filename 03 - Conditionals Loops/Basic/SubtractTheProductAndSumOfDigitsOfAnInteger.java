package Basic;
import java.util.*;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Subtract The Product And Sum Of Digits Of An Integer");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int sum = 0, pro = 1, digit;

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            pro *= digit;
            num /= 10;
        }

        int result = pro - sum;
        System.out.println("Result: " + result);
    }
}
