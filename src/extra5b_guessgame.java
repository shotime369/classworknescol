import java.util.Random;
import java.util.Scanner;

public class extra5b_guessgame {

    public static void main(String[] args) {

        Random rand = new Random();
        int r1 = rand.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number = ");

        for (int q = 1; q <= 5; q++) {

        int num1 = input.nextInt();
        if (num1 == r1) {
            System.out.println("Correct!");
        } else {
            System.out.println("try again");
        }
        }
        System.out.println("The correct answer was " + r1);
    }
}
