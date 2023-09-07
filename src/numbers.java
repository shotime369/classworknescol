import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ask for integer called num
        System.out.print("first number ");
        int num = input.nextInt();
        //ask for input integer called number
        System.out.print("second number ");
        int number = input.nextInt();
//print out sums
        System.out.println ("Sum = " + (num + number));
        System.out.println ("Subtract = "+ (num - number));
        System.out.println ("Multipy= " + (num * number));
        //float the decimal result from division
        float Divresult = (float) num / (float) number;
        System.out.println ("Divide= "+ (Divresult));
        System.out.println ("Modulo= "+ (num % number));
        System.out.println ("Exponent= " + (Math.pow(num,number)));


    }
}

