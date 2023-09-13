import java.util.Scanner;

public class L3E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstname = input.nextLine();
        System.out.print("Enter your surname:");
        String lastname = input.nextLine();
        System.out.print("Enter your year of birth YYYY:");
        String year = input.nextLine();
        System.out.print("Username:");
        System.out.print(firstname.substring(0,1).toUpperCase()); //select first character of name make it uppercase
        System.out.println(lastname.toLowerCase()); //change lastname to lower case
        System.out.print("Password:");
        System.out.print(lastname.substring(0,1).toLowerCase());
        System.out.print(firstname.substring(0,3).toUpperCase());
        System.out.println(year);
    }
}

