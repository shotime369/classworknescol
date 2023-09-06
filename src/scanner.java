import java.util.*;
public class scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = input.nextLine();
        System.out.print("what is your quest? ");
        String quest = input.nextLine();

        System.out.println("good luck " + name + " with your " + quest);

    }
}
