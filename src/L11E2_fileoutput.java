import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L11E2_fileoutput {

    public static void main(String[] args){
        try {
            BufferedReader in = new BufferedReader(new FileReader("outnumbers.txt"));
            String line;
            do {
                line = in.readLine();
                System.out.println(line);

            }
            while (line != null);
        }
        catch (IOException e){
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }
    }


