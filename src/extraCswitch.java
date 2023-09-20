import java.util.Scanner;

public class extraCswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String day = null;
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = input.nextInt();
        switch (dayNumber){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a day :( ";
        }
        System.out.println(day);
    }
}