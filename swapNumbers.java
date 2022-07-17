class swapNumbers {
    public static void main(String[] args) {
        // swapping using third number
        int num1 = 40;
        int num2 = 20;

        System.out.println("-------------------------With using third number-----------------------");
        System.out.println("Before Swapping--- First number is: " + num1 + ", Second number is: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping--- First number is: " + num1 + ", Second number is: " + num2);
        System.out.println("---------------------------------------------------------------------");

        // Swapping without using third number

        num1 = 40;
        num2 = 20;

        System.out.println("-------------------------Without using third number-----------------------");
        System.out.println("Before Swapping--- First number is: " + num1 + ", Second number is: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2; // 40
        num1 = num1 - num2; // 20

        System.out.println("After Swapping--- First number is: " + num1 + ", Second number is: " + num2);
        System.out.println("---------------------------------------------------------------------");
    }
}