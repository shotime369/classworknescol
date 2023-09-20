import java.util.Scanner;

public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount= £");
        double purchase = input.nextDouble();
        if (purchase < (50)) {
            System.out.println("Shipping cost is £10");
            System.out.println("Total cost is: £" + (purchase + 10) );
        } else {
            System.out.println("Your final total is = £" + purchase);
        }
    }
}
