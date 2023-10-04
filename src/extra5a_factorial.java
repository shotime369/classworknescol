import java.util.Scanner;

public class extra5a_factorial {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usernum = input.nextInt();
        int ans = 1;
        for (int n = 1; n <= usernum; n++) {
            ans = ans * n;
            System.out.println(ans);
        }

    }
}
