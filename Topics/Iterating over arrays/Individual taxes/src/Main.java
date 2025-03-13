import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of companies
        int n = scanner.nextInt();

        // Read the incomes of each company
        int[] incomes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }

        // Read the tax percentages of each company
        int[] taxes = new int[n];
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt();
        }

        // Variables to store the company index and the max tax paid
        int maxCompany = 1;
        double maxTax = 0;

        // Calculate tax payments for each company
        for (int i = 0; i < n; i++) {
            double taxPaid = incomes[i] * (taxes[i] / 100.0);
            if (taxPaid > maxTax) {
                maxTax = taxPaid;
                maxCompany = i + 1; // Company numbering starts from 1
            }
        }

        // Print the result
        System.out.println(maxCompany);

        scanner.close();
    }
}