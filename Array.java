public class Array {
    public static void main(String[] args) {
        // Create and initialize a four-element int array
        int[] numbers = {5, 10, 15, 20};

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("The average of the numbers in the array is: " + average);
    }
}
