import java.util.*;
public class scanner {

    public static void main(String[] args) {
        //scanner saves input
        Scanner input = new Scanner(System.in);
        //ask for input string called name
        System.out.print("what is your name? ");
        String name = input.nextLine();
        //ask for input string called quest
        System.out.print("what is your quest? ");
        String quest = input.nextLine();

        System.out.println("good luck " + name + " with your " + quest);

    }
}
