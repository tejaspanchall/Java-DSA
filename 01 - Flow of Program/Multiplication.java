import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("<< Multiplication Table >>");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}