import java.util.Scanner;

public class L5E3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

int score = 0;

        System.out.println("Maths Game");
        System.out.println("What is 6 + 5? = ");
        int number1 = sc.nextInt();
        if (number1 == 11) {
            int score1 = score + 1;
            System.out.println("True");
        } else {
            System.out.println("False");
        }
 System.out.println();


    }
}



