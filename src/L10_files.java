import java.io.*;
public class L10_files {

    public static void Finally(){
        FileWriter out = null;
        try {
            out = new FileWriter("output.txt");
            out.write("Hello World");
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }



    }
    public static void main(String[] args) {

        FileWriter out = null;
        try {
            out = new FileWriter("output.txt");
            out.write("Hello World");
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }



}