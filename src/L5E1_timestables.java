import java.util.Scanner;

public class L5E1_timestables {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Which number to begin: ");
        int number = sc.nextInt();
        for (int times = 1; times <= 12; times ++) {

            System.out.format("%d x %d = %d %n", number, times, (number * times) );
        }

    }
}











