import java.util.Scanner;

public class L2E1_story {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = input.nextLine();
        System.out.print("what is your favourite hobby? ");
        String hobby = input.nextLine();

        System.out.println("The first time " + name + " tried " + hobby + " she knew it would be her favourite thing ever");
        System.out.println("She thought about " + hobby + " all the time, even when she should have been working");
        System.out.println("Keep going " + name + " you'll get to do " + hobby + " again soon!");

    }
}

