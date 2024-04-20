import components.Golf.ScoreCard.ScoreCard;
import components.Golf.ScoreCard.ScoreCard1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Compares Scores of different golfers.
 */
public class GolfComparison {
    /**
     * Quickly inputs a score.
     * @param card
     * @param scores
     */
    static void scoreTracker(ScoreCard card, int[] scores) {
        for (int k = 0; k < scores.length; k++) {
            for (int i = 0; i < scores[k]; i++) {
             card.addStroke();
        }
        card.addHole();
    }
    }
    /**
     * Main.
     * @param args
     */
    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();

        ScoreCard tiger = new ScoreCard1L();
        int[] tScore = {4, 5, 3, 4, 5, 3, 3, 4, 4, 5, 4, 3, 4, 4, 4, 2, 4, 5};
        scoreTracker(tiger, tScore);

        ScoreCard rahm  = new ScoreCard1L();
        int[] rScore = {4, 5, 3, 3, 4, 3, 4, 4, 5, 4, 4, 3, 4, 3, 5, 3, 4, 4};
        scoreTracker(rahm, rScore);

        ScoreCard scheffler  = new ScoreCard1L();
        int[] sScore = {4, 5, 3, 3, 4, 4, 3, 4, 4, 4, 5, 3, 4, 3, 5, 3, 3, 4};
        scoreTracker(scheffler, sScore);

        int rFinal = rahm.totalScore();
        int tFinal = tiger.totalScore();
        int sFinal = scheffler.totalScore();

        int avg = (rFinal + sFinal + tFinal) / 3;

        out.println("Tiger's final round score " + tFinal);
        out.println(tiger.toString());
        out.println("Rahms's final round score " + rFinal);
        out.println(rahm.toString());
        out.println("Scefflers's final round score " + sFinal);
        out.println(tiger.toString());
        out.println("The averages for the last three masters winners final"
        + " round is " + avg);


        out.close();
    }
}
