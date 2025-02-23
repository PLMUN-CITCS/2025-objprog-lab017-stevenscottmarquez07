import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;

        // Validate user input to ensure it's a valid number
        while (score < 0) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0) {
                    System.out.println("Please enter a valid score greater than or equal to 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();
        
        // Calculate the grade based on the score
        String grade = calculateGrade(score);
        
        // Display the calculated grade
        System.out.println("Your Grade is: " + grade);
    }
}
