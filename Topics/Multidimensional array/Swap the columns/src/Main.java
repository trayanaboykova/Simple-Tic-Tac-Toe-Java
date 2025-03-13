import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the dimensions of the matrix
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 2. Create the matrix
        int[][] matrix = new int[n][m];

        // 3. Fill the matrix
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                matrix[r][c] = sc.nextInt();
            }
        }

        // 4. Read the two column indices to swap
        int i = sc.nextInt();
        int j = sc.nextInt();

        // 5. Swap the columns i and j in each row
        for (int r = 0; r < n; r++) {
            int temp = matrix[r][i];
            matrix[r][i] = matrix[r][j];
            matrix[r][j] = temp;
        }

        // 6. Print the resulting matrix
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}