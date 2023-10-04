import java.util.Scanner;

public class L2E3_Supermarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ask for string called item1
        System.out.print("First item name= ");
        String item1 = input.nextLine();
        //ask for input integer called price1
        System.out.print("First item price = £");
        double price1 = input.nextDouble();

//added a new scanner input because it didn't like the words and numbers
        Scanner input2 = new Scanner(System.in);
        System.out.print("Second item name= ");
        String item2 = input2.nextLine();
        System.out.print("Second item price = £");
        double price2 = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Third item name= ");
        String item3 = input3.nextLine();
        System.out.print("Third item price = £");
        double price3 = input3.nextDouble();

        System.out.println("\n******\n");
        System.out.println("Thankyou for shopping at Jmart ");
        System.out.format(item1 + "........£%.2f%n", price1);
        System.out.format(item2 + "........£%.2f%n", price2);
        System.out.format(item3 + "........£%.2f%n", price3);
        System.out.format("Total = ..£ %.2f %n", (price1 + price2 + price3));
    }
}