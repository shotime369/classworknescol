public class L8E2_ArrayExamScores {
    public static void main(String[] args) {
        int[] scores = {78, 85, 62, 49, 98, 64, 22, 47, 89, 55};
        for (int value : scores) {
            System.out.println(value);

        }

        int av = 0;
        for (int score : scores) {
            av = av + score;
        }
        int aver = av / 100 * 10;
        System.out.println("The average of the results is: " + aver);



    }
}
