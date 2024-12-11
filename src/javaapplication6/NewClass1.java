
package javaapplication6;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Step 1: Input the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Step 2: Declare the 2D array
        int[][] array = new int[rows][cols];

        // Step 2: Fill the array with user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Step 3: Calculate the sum of all elements and find the largest element
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }

        // Step 4: Display the results
        System.out.println("\nSummary:");
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Largest element: " + largest);

        scanner.close();
    }
    
}
