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

        // Read the two numbers n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Check if n and m appear next to each other
        boolean neverAdjacent = true;
        for (int i = 0; i < size - 1; i++) {
            if ((array[i] == n && array[i + 1] == m) || (array[i] == m && array[i + 1] == n)) {
                neverAdjacent = false;
                break;
            }
        }

        // Print the result
        System.out.println(neverAdjacent);
        scanner.close();
    }
}