import java.util.Scanner;

class arrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Array range.");
        int range = sc.nextInt();

        int[] arr = new int[range];

        System.out.println("Please enter the " + range + " numbers");

        // Storing the values in Array by the user
        for (int i = 0; i <= range - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // printing entered numbers
        System.out.println("You entered: ");
        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println("");

        // Check the prime numbers in the array
        System.out.println("Below are the Prime Numbers.");
        for (int j = 0; j <= range - 1; j++) {
            int check = arr[j];

            // checking prime number
            int k;
            for (k = 2; k <= check; k++) {
                if (check % k == 0) {
                    break;
                }
            }
            if (check == k) {
                System.out.print(arr[j] + " ");
            }

        }

    }
}