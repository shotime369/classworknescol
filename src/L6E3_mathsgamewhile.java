import java.util.Random;
import java.util.Scanner;

public class L6E3_mathsgamewhile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Maths Game!");
        //start lives
        int score = 0;
        int lives = 3;
        // while loop
        while (lives > 0) {
            //define number of loops for questions
            for (int q = 1; q <= 10; q++) {
                //add new random class
                Random rand = new Random();
                //generate 2 random numbers
                int r1 = rand.nextInt(20);
                int r2 = rand.nextInt(20);
                //create correct answer
                int correct = (r1 + r2);
                //display question
                System.out.print("Question " + q + ": ");
                System.out.print("What is " + r1 + " + " + r2 + "? = ");
                int ans1 = sc.nextInt();
                //if you are correct
                if (ans1 == correct) {
                    System.out.println("Correct!");
                    System.out.println("You have " + lives + " lives left \n");
                    score++;
                }
                // else you get it wrong
                else if (ans1 != correct) {
                    System.out.println("False");
                    lives--;
                    System.out.println("You have " + lives + " lives left \n");
                }
                if (lives < 0){
                    System.out.println("OUT OF LIVES");
                    break;
                }
            }
            //print final score
            System.out.println("Your score is = " + score);
            if (score >= 7) {
                System.out.println("Great job!");
            } else {
                System.out.println("Keep practicing!");
                break;
            }
        }
    }
}




