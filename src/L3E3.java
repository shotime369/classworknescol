import java.util.Scanner;

public class L3E3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: £");
        double loanamount = input.nextDouble();
        System.out.print("Interest rate (APR%):");
        double interest = input.nextDouble();
        System.out.print("Number of years:");
        int years = input.nextInt();

        double j = ((interest / 100) / 12); //j = 0.05/12
        double j1 = (1 + j);
        int numyr = (years * 12); //n
        double exp2 = (Math.pow(j1, -numyr)); //(1+j)^-n
        double exp3 = (1-exp2);//(1 - (1+j)^-n )
        double Monthly = (loanamount * (j / exp3)); //L( j / (1 - (1+j)^-n )
        System.out.print("\n");
        String Monthlyp = String.format("%.2f", Monthly);
        System.out.println("Monthly payment=£" + Monthlyp);

        //M = L( j / (1 - (1+j)^-n ) )
        //M = monthly payment
        //L = Loan amount
        //j = interest rate in months
        //      (for interest rate of 5%APR, j = 0.05/12)
        //n = number of years * 12
    }
}