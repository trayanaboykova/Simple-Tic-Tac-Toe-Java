package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] grid = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printGrid(grid);
        char currentPlayer = 'X';

        while (true) {
            // Get a valid move
            int[] move = getValidMove(scanner, grid);
            int row = move[0];
            int col = move[1];

            // Place the move
            grid[row][col] = currentPlayer;
            printGrid(grid);

            // Check game status
            if (checkWin(grid, currentPlayer)) {
                System.out.println(currentPlayer + " wins");
                break;
            } else if (isDraw(grid)) {
                System.out.println("Draw");
                break;
            }

            // Swap player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    // Helper function to print the game grid
    private static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (char[] row : grid) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    // Function to get a valid move
    private static int[] getValidMove(Scanner scanner, char[][] grid) {
        while (true) {
            System.out.print("Enter your move (row and column): ");
            String rowInput = scanner.next();
            String colInput = scanner.next();

            // Validate numeric input
            if (!isNumeric(rowInput) || !isNumeric(colInput)) {
                System.out.println("You should enter numbers!");
                continue;
            }

            int row = Integer.parseInt(rowInput) - 1;
            int col = Integer.parseInt(colInput) - 1;

            // Validate range
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            // Validate if the cell is occupied
            if (grid[row][col] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            return new int[]{row, col}; // Return valid move
        }
    }

    // Check if a player has won
    private static boolean checkWin(char[][] grid, char player) {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if ((grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) ||
                    (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        return (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) ||
                (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player);
    }

    // Check if the board is full (draw)
    private static boolean isDraw(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Helper function to check if a string is numeric
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}