import java.util.Random;
import java.util.Scanner;

public class L6E3_mathsgamewhile {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Maths Game!");
        //Scanner input = new Scanner(System.in);
            //start lives
            int lives = 3;
            while (lives > 0){
                for (int q = 1; q <= 10; q++) {
                    //define number of loops for questions
                    //for (int q = 1; q >= 1; q++) {
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
                    }
                    // else you get it wrong
                    else if (ans1 != correct) {
                        System.out.println("False");
                        lives--;
                        System.out.println("You have " + lives + " lives left \n");

                    }
                }
            }
            }
        }



