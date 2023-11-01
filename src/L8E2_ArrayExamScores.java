public class L8E2_ArrayExamScores {
    public static void main(String[] args) {
        double av = 0;
        int[] scores = {78, 85, 62, 49, 98, 64, 22, 47, 89, 55};
        for (int value : scores) {
            System.out.println(value);
            av = av + value;
        }
        double aver = av / 100 * 10;
        System.out.println("The average score is: " + aver);

    }
}
