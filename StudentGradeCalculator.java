import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        double[] grades = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter grade for subject %d: ", i + 1);
            grades[i] = scanner.nextDouble();
        }

        double averageGrade = calculateAverageGrade(grades);
        char grade = calculateLetterGrade(averageGrade);

        System.out.printf("\nStudent Name: %s%n", name);
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        System.out.printf("Letter Grade: %c%n", grade);
    }

    private static double calculateAverageGrade(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private static char calculateLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}