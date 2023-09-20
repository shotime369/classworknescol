import java.util.Scanner;

public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstname = input.nextLine();
        System.out.print("Enter your surname:");
        String lastname = input.nextLine();
        System.out.print("Total value of your order =£");
        double amount = input.nextDouble();
        System.out.print("Amount of your deposit =£");
        double deposit = input.nextDouble();

        System.out.println("\n**RECEIPT**\n");
        System.out.println(firstname.substring(0,1) +" "+ lastname);
        System.out.println("Order total:£" + amount);
        System.out.println("Deposit paid:£" + deposit);
        System.out.println("Remainder:£" + (amount-deposit));
//free toaster if deposit is more than 100
        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");

    }
}