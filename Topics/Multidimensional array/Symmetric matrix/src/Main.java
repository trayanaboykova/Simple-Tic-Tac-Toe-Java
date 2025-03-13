import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the integer n
        int n = sc.nextInt();

        // Step 2: Create the matrix
        int[][] matrix = new int[n][n];

        // Step 3: Fill the matrix with input values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Check if the matrix is symmetric
        boolean isSymmetric = true;
        for (int i = 0; i < n && isSymmetric; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // Step 5: Print the result
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}