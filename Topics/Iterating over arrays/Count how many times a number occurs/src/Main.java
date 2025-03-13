import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the number n
        int n = scanner.nextInt();

        // Count occurrences of n in the array
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}