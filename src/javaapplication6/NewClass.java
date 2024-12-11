

package javaapplication6;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Step 1: Accept the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Initialize arrays for marks
        int[] subject1 = new int[numStudents];
        int[] subject2 = new int[numStudents];
        int[] totalMarks = new int[numStudents];

        // Step 2: Input marks for both subjects
        System.out.println("Enter marks for Subject 1:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            subject1[i] = scanner.nextInt();
        }

        System.out.println("Enter marks for Subject 2:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            subject2[i] = scanner.nextInt();
        }

        // Step 3: Calculate total marks for each student
        int totalSum = 0;
        for (int i = 0; i < numStudents; i++) {
            totalMarks[i] = subject1[i] + subject2[i];
            totalSum += totalMarks[i];
        }

        // Step 4: Calculate class average, highest and lowest total marks
        double classAverage = totalSum / (double) numStudents;
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;
        for (int marks : totalMarks) {
            if (marks > highestMarks) highestMarks = marks;
            if (marks < lowestMarks) lowestMarks = marks;
        }

        // Step 5: Determine above/below average and count students scoring above 90 in both subjects
        int above90InBoth = 0;
        String[] performance = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            if (subject1[i] > 90 && subject2[i] > 90) {
                above90InBoth++;
            }
            if (totalMarks[i] >= classAverage) {
                performance[i] = "Above Average";
            } else {
                performance[i] = "Below Average";
            }
        }

        // Step 6: Display results
        System.out.println("\nStudent Performance:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Subject 1: " + subject1[i] + ", Subject 2: " + subject2[i] +
                    ", Total: " + totalMarks[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("Class Average: " + classAverage);
        System.out.println("Highest Total Marks: " + highestMarks);
        System.out.println("Lowest Total Marks: " + lowestMarks);
        System.out.println("Number of students scoring above 90 in both subjects: " + above90InBoth);

        System.out.println("\nPerformance Relative to Class Average:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + performance[i]);
        }

        scanner.close();
    }
    
}
