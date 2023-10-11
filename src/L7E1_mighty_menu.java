import java.util.Scanner;

public class L7E1_mighty_menu {

    public static void showMenu() {
        System.out.println("""
                                    Choose Addition (1)\s
                                    Subtraction (2)\s
                                    Multiplication (3)\s
                                    Quit (4) ""
                """);
    }
    public static int getOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your option: ");
        return sc.nextInt();
    }
    public static void option1() {
        System.out.println("addition");
    }
    public static void option2() {
        System.out.println("subtraction");
    }
    public static void option3() {
        System.out.println("multiplication");
    }
    public static void option4() {
        System.out.println("Bye!");
    }

    public static void main(String[] args) {

        int option;
        do {
            showMenu();
            option = getOption();
            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                option4();
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4");
            }
        }
        while (option != 4);

    }
}


