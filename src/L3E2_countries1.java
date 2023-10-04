import java.util.Scanner;

public class L3E2_countries1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Q1- what is the capital of Spain?");
        String spain = input.nextLine();
        System.out.println(spain.toLowerCase().contains("madrid")); // true

        System.out.print("Q1- what is the capital of the UK?");
        String uk = input.nextLine();
        System.out.println(uk.toLowerCase().contains("london")); // true

        //creating new variable to work out the same thing
        System.out.print("Q1- what is the capital of the Italy?");
        String italy = input.nextLine();
        String italylower = italy.toLowerCase();
        System.out.println(italylower.contains("rome")); // true

    }
}
