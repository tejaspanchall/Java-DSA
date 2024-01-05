import java.util.*;

public class GreetingMsg {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();

        System.out.println("Hello " + name + ", I'm lucky to call you a friend <3. Thanks for all of your support.");
    }
}
