import java.util.Scanner;

public class extraA {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Guess a number: ");
            int num1 = input.nextInt();
            if (num1 == 21) {
                System.out.println("Correct - it's 21!");
            } else if (num1 > 21) {
                System.out.println("Lower - try again");
            } else {
                System.out.println("Higher - try again");
            }
        }
    }

