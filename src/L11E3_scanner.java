import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class L11E3_scanner {
    public static void main(String[] args) {
        try ( Scanner in = new Scanner( new FileReader("numbers2") ) ) {
            double sum = 0;
            do {
                double num = in.nextDouble();
                sum = (sum + num);
                System.out.println(sum);
           }
            while ( in.hasNextLine() );
        }
        catch (IOException e){
            System.out.println("Error occurred reading file: " + e.toString());
        }
    }
    }

