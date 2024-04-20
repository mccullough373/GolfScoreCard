import components.Golf.ScoreCard.ScoreCard;
import components.Golf.ScoreCard.ScoreCard1L;
import components.simplereader.SimpleReader1L;
import components.simplereader.SimpleReader;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Demonstrates how to use ScoreCard.
 */
public class GolfScore {
    /**
     * adds strokes.
     * @param card
     * @param s
     * @param out
     */
    static void addStrokes(ScoreCard card, String s, SimpleWriter out) {
        if (s.equals(" ")) {
            card.addStroke();
            out.println("Nice Shot. Current Strokes =  "
             + card.currentStrokes());
        } else if (s.equals("o")) {
            card.outOfBounds();
            out.println("Get it next time! Current Strokes =  "
             + card.currentStrokes());
        } else if (s.equals("m")) {
            card.addHole();
            out.print("Nice Hole! You scored a ");
        }

    }

    /**
     * Main.
     * @param args
     */
    public static void main(String[] args) {
        final int holes = 18;
        ScoreCard card = new ScoreCard1L();
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.println("Would you like to start a new round of golf?");
        out.print("Press y for yes, or n for no");
        String choice = in.nextLine();
        if (choice.equals("y")) {
            for (int i = 1; i <= holes; i++) {
                boolean b = true;
                out.println("Welcome to hole " + i);
                while (b) {
                    out.print("Press space to add a stroke, o for out of bounds"
                    + " , or m to move onto the next hole!");
                    String action = in.nextLine();
                    addStrokes(card, action, out);
                    if (action.equals("m")) {
                        out.println(card.score(i));
                        out.println("Your total score is " + card.totalScore());
                        b = false;
                    }
                }
            }
            out.println("Your total score is " + card.totalScore());
        }
    in.close();
    out.close();
    }
}
