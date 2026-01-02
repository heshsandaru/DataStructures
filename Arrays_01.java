public class Arrays_01 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        // Print original array
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sort the array
        java.util.Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


        /*////////////////////*/

        // Declaration and Initialization
        int[] arr = new int[5]; // Creating an integer array of size 5

        // Accessing elements
        arr[0] = 10; // Assigning value 10 to the first element
        int value = arr[2]; // Accessing the third element
        System.out.println("value: " + value);

        // Iterating through the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
