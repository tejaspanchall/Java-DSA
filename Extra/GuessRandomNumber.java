import java.util.*;

public class GuessRandomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = 0;
        int randomNumber = (int)(Math.random()*100);

        do {
            System.out.print("Guess the number (1-100): ");
            myNumber = sc.nextInt();

            if (randomNumber == myNumber) {
                System.out.println("WOHOO, You guessed the correct number.");
                break;
            }
            else if(randomNumber < myNumber) {
                System.out.println("The number you have guessed is Large.");
            }
            else {
                System.out.println("The number you have guessed is Small.");
            }
        } while (myNumber >= 0);

        System.out.println("Correct number is: " + randomNumber);
    }
}