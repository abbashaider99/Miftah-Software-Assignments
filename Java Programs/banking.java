import java.util.Scanner;
import java.text.NumberFormat;

interface services {
    int deposit(int amount);

    int withdrawal(int amount);

    void getAmount();
}

class banking implements services {

    static int amount = 0, balance = 0, choice, withAmount;

    @Override
    public int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }

    @Override
    public int withdrawal(int withAmount) {
        balance = balance - withAmount;
        return balance;
    }

    @Override
    public void getAmount() {
        System.out.println("Available balance in your A/c is Rs. " + balance);
    }

    public static void main(String[] args) {

        NumberFormat numFor = NumberFormat.getInstance();
        banking b = new banking();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 20) {

            System.out.println("");
            System.out.println("Iteration No. " + i + ", and Left " + (20 - i));
            System.out.println("---------------------------------------------");
            System.out.println("-------What do you want to do??--------");
            System.out.println("Press 1 for Money Deposit--~");
            System.out.println("Press 2 for Money Withdrawal--~");
            System.out.println("Press 3 for Check Balance--~");

            choice = sc.nextInt();

            // deposit amount
            if (choice == 1) {
                System.out.println("Please enter an Amount to deposit");
                amount = sc.nextInt();
                if (amount > 1) {
                    System.out.println(
                            "Transaction Success! Available balance is Rs. " + numFor.format(b.deposit(amount)));
                } else {
                    System.out.println("Transaction failed! Please enter a valid amount.");
                }

                // withAmount amount
            } else if (choice == 2) {
                System.out.println("Please enter an Amount to Withdrawal (Min~ 100)");
                withAmount = sc.nextInt();
                if (withAmount >= 100 && balance > withAmount) {
                    System.out.println(
                            "Transaction Success! Available balance is Rs. " + numFor.format(b.withdrawal(withAmount)));
                } else if (withAmount < 100) {
                    System.out.println("Please enter amount greater than 100");

                } else {
                    System.out.println(
                            "Transaction failed! Insufficiant balance, Available Rs. " + numFor.format(balance));
                }

                // check balance
            } else if (choice == 3) {

                b.getAmount();
                // invalid choice
            } else if (choice > 3) {
                System.out.println("Please choose a valid option");
            }
            i++;
        }
    }
}