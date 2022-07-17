import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to find factorial");
        int num = sc.nextInt();

        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum = sum * i;
        }
        System.out.println("Factorial of " + num + " is : " + sum);
    }
}