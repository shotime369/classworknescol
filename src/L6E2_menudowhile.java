import java.util.Scanner;

public class L6E2_menudowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        do {
            System.out.println("""
                    Choose Addition (1)\s
                    Subtraction (2)\s
                    Multiplication (3)\s
                    Quit (4)\s
                    =\s""");
            menu = input.nextInt();
            System.out.println ("option selected " + menu);
        }
        while (menu != 4);

    }
}



