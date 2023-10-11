import java.util.Scanner;

import static java.lang.Integer.sum;

public class L7E2_sumfunction {

    public static int calculateSum(int num1, int num2){
        return (num1 + num2);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        int result = calculateSum(num1, num2);
        System.out.format("The sum of %d and %d is %d", num1, num2, result);
    }

}
