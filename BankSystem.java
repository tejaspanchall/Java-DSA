import java.util.*;

class Bank {
    String name;
    int acNum;
    int totalAmount;

    Bank(int inAmount) {
        totalAmount = inAmount;
    }

    void deposit() {
        int depAmt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        depAmt = sc.nextInt();
        totalAmount = totalAmount + depAmt;
        System.out.println("Your total balance after deposit: " + totalAmount);
    }

    void withdraw() {
        int withAmt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdwal: ");
        withAmt = sc.nextInt();
        if (withAmt > totalAmount) {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        } else {
            totalAmount -= withAmt;
            System.out.println("Your total balance after withdrawal: " + totalAmount);
        }
    }
    
    void displayDetails() {
        System.out.println("Your name is: " + name);
        System.out.println("Your account number is: " + acNum);
        System.out.println("Your total bank balance is: " + totalAmount);
    }
}

public class BankSystem {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String namee = sc.nextLine();
    
    System.out.print("Enter your account number: ");
    int accNum = sc.nextInt();

    System.out.print("Enter your initial amount: ");
    int innAmount = sc.nextInt();

    Bank jupiter = new Bank(innAmount);
    jupiter.acNum = accNum;
    jupiter.totalAmount = innAmount;
    jupiter.name = namee;

    int input;
    
    do {
        System.out.println("Select option");
        System.out.println("1. Display balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        
        input = sc.nextInt();
        switch (input) {
        case 1:
            jupiter.displayDetails();
            break;
        case 2:
            jupiter.deposit();
            break;
        case 3:
            jupiter.withdraw();
            break;
        case 4:
            break;
        default:
            System.out.println("Invalid input");
            break;
    }
    } while (input != 4);
}
}