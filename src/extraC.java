import java.util.Scanner;

public class extraC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = input.nextInt();
        if (dayNumber ==1 ) {
            System.out.println("Monday");
        } else if (dayNumber ==2) {
            System.out.println("Tuesday");
        } else if (dayNumber ==3) {
            System.out.println("Wednesday");
        } else if (dayNumber ==4) {
            System.out.println("Thursday");
        } else if (dayNumber ==5) {
            System.out.println("Friday");
        } else if (dayNumber ==6) {
            System.out.println("Saturday");
        } else if (dayNumber ==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a day :(");
        }
    }
}
