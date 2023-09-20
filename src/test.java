import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstname = input.nextLine();
        System.out.print("Enter your surname:");
        String lastname = input.nextLine();
        System.out.print("Enter your year of birth YYYY:");
        String year = input.nextLine();
        System.out.println("Username:" + firstname.substring(0,1).toUpperCase() + lastname.toLowerCase());
        System.out.print("Password:" + lastname.substring(0,1).toLowerCase() + firstname.substring(0,3).toUpperCase() + year);
    }
}