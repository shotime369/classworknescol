import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class L11E3_scanner {
    public static void main(String[] args) {
        double sum = 0;
        try ( Scanner in = new Scanner( new FileReader("numbers2") ) ) {
            do {
                double num = in.nextDouble();
                sum = (sum + num);
               // System.out.println(sum);
           }
            while ( in.hasNextInt() );
        }
        catch (IOException e){
            System.out.println("Error occurred reading file: " + e.toString());
        }
        System.out.println("sum = " + sum);

    }
    }

