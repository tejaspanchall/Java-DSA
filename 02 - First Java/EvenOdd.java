import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}