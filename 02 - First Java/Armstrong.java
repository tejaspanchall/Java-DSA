import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int ogNum, remainder, result = 0, n = 0;
        ogNum = num;

        for (;ogNum != 0; ogNum /= 10) {
            n++;
        }
        ogNum = num;

        for (;ogNum != 0; ogNum /= 10) {
            remainder = ogNum % 10;
            result += Math.pow(remainder, n);
        }

        if (result == num) {
            System.out.println(num + " is armstrong number");
        }
        else {
            System.out.println(num + " is not an armstrong number");
        }
    }
}