import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the GPA Calculator!");

        // Variables to store total grade points and total credits
        double totalGradePoints = 0.0;
        int totalCredits = 0;

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            
            // Input grade and credits for the course
            System.out.print("Enter the grade (A=4, B=3, C=2, D=1, F=0): ");
            double grade = scanner.nextDouble();
            
            System.out.print("Enter the credits for this course: ");
            int credits = scanner.nextInt();

            // Update total grade points and total credits
            totalGradePoints += grade * credits;
            totalCredits += credits;
        }

        // Calculate GPA
        double gpa = totalGradePoints / totalCredits;

        System.out.printf("Your GPA is: %.2f%n", gpa);
        
        scanner.close();
    }
}
