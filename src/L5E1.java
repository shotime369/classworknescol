import java.util.Scanner;

public class L5E1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Which number to begin: ");
        int number = sc.nextInt();
        for (int times = number; times <= (number * 12); times += number) {
            System.out.println(" " + times);
            System.out.format("%d x %d = %d %n", number, times, (number * times) );
        }

    }
}


                //for (int times = number ; times <= (number * 1); times += number) {
                    //System.out.println(number + "x1 = " + times);
                //for (int times2 = number ; times2 == (number * 2); times2 += number) {
                        //System.out.println(number + "x2 = " + times2);








