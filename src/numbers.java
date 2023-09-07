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

        System.out.println (num+ "+" +number + "=" +(num + number));
        System.out.println (num+ "-" +number + "=" + (num - number));
        System.out.println (num+ "*" +number + "=" +(num * number));
        //float the decimal result from division
        float Divresult = (float) num / (float) number;
        System.out.print (num+ "/" +number + "=");
        System.out.println (Divresult);
        System.out.println (num+ "%" +number + "=" +(num % number));
        System.out.println (num+ "^" +number + "=" +(Math.pow(num,number)));


    }
}

