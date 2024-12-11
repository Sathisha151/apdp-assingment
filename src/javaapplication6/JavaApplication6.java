
package javaapplication6;

public class JavaApplication6 {

    
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 76, 92, 70, 65, 95, 80};

        int totalMarks = 0;
        int above80Count = 0;
        int highestMark = marks[0];
        int lowestMark = marks[0];

        System.out.println("Student Performance:");
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];

            if (marks[i] > 80) {
                above80Count++;
            }

            if (marks[i] > highestMark) {
                highestMark = marks[i];
            }

            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
            }

            System.out.printf("Student %d - Marks: %d - Performance: ", i + 1, marks[i]);

            if (marks[i] >= 85) {
                System.out.println("Excellent");
            } else if (marks[i] >= 70) {
                System.out.println("Good");
            } else {
                System.out.println("Needs Improvement");
            }
        }

        double averageMarks = (double) totalMarks / marks.length;

        System.out.println("\nSummary:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.1f\n", averageMarks);
        System.out.println("Highest Marks: " + highestMark);
        System.out.println("Lowest Marks: " + lowestMark);
        System.out.println("Number of students scoring above 80: " + above80Count);

    }
    
}
