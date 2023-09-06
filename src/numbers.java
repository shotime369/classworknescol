import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("first number ");
        int num = input.nextInt();

        System.out.print("second number ");
        int number = input.nextInt();

        System.out.print ("Sum = ");
        System.out.println (num + number);
        System.out.print ("Subtract = ");
        System.out.println (num - number);
        System.out.print ("Multipy= ");
        System.out.println (num * number);
        System.out.print ("Divide= ");
float Divresult = (float) num / (float) number;
        System.out.print(Divresult);
        System.out.print ("Modulo= ");
        System.out.println (num % number);
        System.out.print ("Exponent= ");
        System.out.println (num % number);


    }
}

