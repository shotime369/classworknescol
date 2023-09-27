import java.util.Random;
import java.util.Scanner;

public class L5E3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Maths Game!");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose Addition (1) or Subtraction (2) = ");
        int menu = input.nextInt();
        if (menu == 1){
            //start score
            int score = 0;
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
                    score++;
                    System.out.println("Your score is " + score + "\n");
                }
                // else you get it wrong
                else System.out.println("False \n");
            }
            //print final score
            System.out.println("Your score is = " + score);
            if (score >= 7) {
                System.out.println("Great job!");
            } else {
                System.out.println("Keep practicing!");
            }
        } else if (menu == 2) {
            //start score
            int score = 0;
            //define number of loops for questions
            for (int q = 1; q <= 10; q++) {
                //add new random class
                Random rand = new Random();
                //generate 2 random numbers
                int r1 = rand.nextInt(20);
                int r2 = rand.nextInt(20);
                //create correct answer
                int correct = (r1 - r2);
                //display question
                System.out.print("Question " + q + ": ");
                System.out.print("What is " + r1 + " - " + r2 + "? = ");
                int ans1 = sc.nextInt();
                //if you are correct
                if (ans1 == correct) {
                    System.out.println("Correct!");
                    score++;
                    System.out.println("Your score is " + score + "\n");
                }
                // else you get it wrong
                else System.out.println("False \n");
            }
            //print final score
            System.out.println("Your score is = " + score);
            if (score >= 7) {
                System.out.println("Great job!");
            } else {
                System.out.println("Keep practicing!");
            }

        }
    }
}





