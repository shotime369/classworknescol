import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class L11E4_comparefiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("text file = ");
        String userinput = input.nextLine();
        System.out.println("text file 2 = ");
        String userinput2 = input.nextLine();

        boolean match = false;
        try {
            BufferedReader in = new BufferedReader(new FileReader(userinput));
            BufferedReader in2 = new BufferedReader(new FileReader(userinput2));
            String line;
            String line2;
            do {
                line = in.readLine();
                line2 = in2.readLine();
                if (Objects.equals(line, line2)) {
                    match = true;
                } else {
                    match = false;
                    break;
                }
            }
            while (line != null);
        } catch (IOException e) {
            System.out.println("Error" + e.toString());
        }
        if (match) {
            System.out.println("match");
        }
        else {
            System.out.println("no match");
        }
    }



    }

