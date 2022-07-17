import java.util.Scanner;

class maxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter numbers range: ");
        int range = sc.nextInt();

        int arr[] = new int[range];

        // user input
        for (int i = 0; i < range; i++) {
            arr[i] = sc.nextInt();
        }

        // maximum numbers
        for (int j = 0; j < range - 1; j++) {
            for (int k = 0; k < range - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }

        System.out.println("Maximun number is: " + arr[arr.length - 1]);

    }
}