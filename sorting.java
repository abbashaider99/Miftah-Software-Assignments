class sorting {
    public static void main(String[] args) {
        int[] arr = { 87, 34, 51, 92, 23, 54, 18, 63 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }

        // printing after sorting
        System.out.println("After Sorting");
        for (int print : arr) {
            System.out.print(print + " ");
        }

    }
}