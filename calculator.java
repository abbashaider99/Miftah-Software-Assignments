import java.util.Scanner;

class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("------------------------");
        System.out.println("Please Press 1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Divide.");
        int select = sc.nextInt();

        System.out.print("Now Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Ok, Please enter second number: ");
        int num2 = sc.nextInt();

        // instead switch case we can use method also. that will be quite complex. It's
        // simple and consuming less memory.
        switch (select) {
            case 1:
                System.out.println("Your result is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Your result is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Your result is: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Your result is: " + (num1 / num2));
                break;
            default:
                System.out.println("Oh no!! Please provide the valid number. ");

        }
    }
}