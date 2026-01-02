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
    }
}
