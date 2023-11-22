import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L11E1_files {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number = ");
        int userinput = input.nextInt();

        try (PrintWriter out = new PrintWriter(new FileWriter("outnumbers.txt"))) {
            int i;
            for (i = 1; i <= 12; i++) {
                out.format("%d x %d = %d\n", i,userinput, userinput * i);
                out.close();
            }
            out.close();
            } catch(IOException e){
                System.out.println("Error occurred writing to file: " + e.toString());
            }
        }
    }
