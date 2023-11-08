import java.io.File;
import java.util.Scanner;

public class L9E2_errors {
    public static void exception1() {
        // exception 1
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        //exception - divide by zero
    }

    public static void exception2() {
        // exception 2
        try {
            int exception2 = Integer.MAX_VALUE + 1;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        //can't print past max value
    }



    public static void exception3() {
        // exception 3
        try {
        int[] myArray3 = new int[5];
        int exception3 = myArray3[5];
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        //index out of bounds for 5
    }

    public static void exception4() {
        // exception 4
            try {
        int[] myArray4 = null;
        int exception4 = myArray4[0];
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        //myarray4 is empty
    }

    public static void exception5() {
        // exception 5
                try {
        File exception5 = new File("exception5.txt");
       Scanner scanner = new Scanner(exception5);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                //can't find file
    }

    public static void exception6() {
        // exception 6
                    try {
        String thisString = "Hello";
        int exception6 = Integer.parseInt(thisString);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    //hello is a string not an integer
    }

    public static void exception7() {
        // exception 7
                        try {
        String exception7 = null;
        System.out.println(exception7.toUpperCase());
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                        //string is null
    }
    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }
}



