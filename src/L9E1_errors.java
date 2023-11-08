import java.util.Scanner;

public class L9E1_errors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String response = scanner.nextLine();

            for (int i = 10; i >= 0; i--) {
                try{
                String character = response.substring(0, 1);
               response = response.substring(1, response.length());
                System.out.print(" " + character);
                }
                catch (Exception e){
                    System.out.print(" ");
                }
            }
        }
    }

