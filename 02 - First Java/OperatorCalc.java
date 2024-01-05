import java.util.*;

public class OperatorCalc {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Select the operator(+, -, *, /): ");
        char temp = input.next().charAt(0);

        if (temp == '+') {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (temp == '-') {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (temp == '*') {
            System.out.println("Result: " + (num1 * num2));
        }
        else if (temp == '/') {
            System.out.println("Result: " + (num1 / num2));
        }
    }
}