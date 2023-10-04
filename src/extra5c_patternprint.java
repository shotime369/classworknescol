import java.util.Scanner;

public class extra5c_patternprint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1-5) = ");
        int num1 = input.nextInt();
        System.out.print("Enter a number (1-5) = ");
        int num2 = input.nextInt();
        System.out.print("Enter a number (1-5) = ");
        int num3 = input.nextInt();

        for (int q = 1; q <= 20; q++) {
        if (num1 == 1) {
            System.out.print("*");
        } else if (num1 == 2) {
            System.out.print("_");
        } else if (num1 == 3) {
            System.out.print("=");
        } else if (num1 == 4) {
            System.out.print("/");
        } else if (num1 == 5) {
            System.out.print(".");
        } else {
            System.out.print(" ");
        }

        if (num2 == 1) {
                System.out.print("*");
            } else if (num2 == 2) {
                System.out.print("_");
            } else if (num2 == 3) {
                System.out.print("=");
            } else if (num2 == 4) {
                System.out.print("/");
            } else if (num2 == 5) {
                System.out.print(".");
        } else {
            System.out.print(" ");
        }


       if (num3 == 1) {
            System.out.print("*");
        } else if (num3 == 2) {
            System.out.print("_");
        } else if (num3 == 3) {
            System.out.print("=");
        } else if (num3 == 4) {
            System.out.print("/");
        } else if (num3 == 5) {
            System.out.print(".");
        } else {
            System.out.print(" ");
        }
        }
    }
}
