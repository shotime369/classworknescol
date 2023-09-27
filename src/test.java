import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Math Quiz Game!");
        System.out.println("Answer 10 math questions to test your skills.\n");

        for (int i = 1; i <= 10; i++) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            int correctAnswer = num1 + num2;

            System.out.print("Question " + i + ": ");
            System.out.print(num1 + " + " + num2 + " = ? ");

            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".\n");
            }
        }

        System.out.println("Quiz complete!");
        System.out.println("Your score: " + score + " out of 10");

        if (score >= 7) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep practicing!");
        }

        scanner.close();
    }
}
