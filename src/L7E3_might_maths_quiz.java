import java.util.Random;
import java.util.Scanner;

public class L7E3_might_maths_quiz {


    public static int askQuestion(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        //add new random class
        Random rand = new Random();
        //generate 2 random numbers
        int r1 = rand.nextInt(20);
        int r2 = rand.nextInt(20);
        System.out.format("What is %d + %d? = ", r1, r2);
        int userAnswer = sc.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score) {
        System.out.println("Correct!");
        score++;
        return score;
    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong :( The answer is " + answer);
        lives--;
        System.out.format("you have %d left", lives);
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.println("Game over. Your score is " + score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }


    public static void main(String[] args) {
        System.out.println("Maths Game!");
        //start counts
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;

        while (count <= 10 && lives > 0) {
            userAnswer = askQuestion(count, count * count);
            answer = count + (count * count);
            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver (score,lives);
            }
        }


