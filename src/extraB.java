import java.util.Scanner;

public class extraB {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter score= %");
    int score = input.nextInt();
    if (score > 70) {
        System.out.println("Grade = A");
    } else if (score > 60) {
        System.out.println("Grade = B");
    } else if (score > 50) {
        System.out.println("Grade = C");
    } else if (score > 40) {
        System.out.println("Grade = D");
    } else {
        System.out.println("No Award");
    }
}
}

