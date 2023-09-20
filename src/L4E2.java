import java.util.*;

public class L4E2{

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Q1- what is the capital of Spain? ");
            String spain = input.nextLine();
            if (!spain.toLowerCase().equals("madrid")) {
                System.out.println("Sorry the correct answer is Madrid");
            }

            System.out.print("Q1- what is the capital of the UK? ");
            String uk = input.nextLine();
            if (!uk.toLowerCase().equals("london")) {
                System.out.println("Sorry the correct answer is London");
            }

            System.out.print("Q1- what is the capital of the Italy? ");
            String italy = input.nextLine();
            if (!italy.toLowerCase().equals("rome")) {
                System.out.println("Sorry the correct answer is Rome");
            }


        }
    }

