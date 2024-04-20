package components.Golf.ScoreCard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * JUnit test fixture for {@code ScoerCard}'s kernel methods.
 *
 * @author William Mccullough
 *
 */
public class ScoreCardTestKernel {

    @Test
    /**
     * Test for addStroke on zero
     */
    public void addStrokeTestOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        int stroke = 1;
        assertEquals(stroke, card1.currentStrokes());
    }

    @Test
    /**
     * Test for addStroke on multiple
     */
    public void addStrokeTestMultiple() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        int stroke = 3;
        assertEquals(stroke, card1.currentStrokes());
    }

    @Test
    /**
     * Test for addStroke on a lot
     */
    public void addStrokeTestALot() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        int stroke = 7;
        assertEquals(stroke, card1.currentStrokes());
    }

    @Test
    /**
     * Test for score on hole 1
     */
    public void scoreTestOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addHole();
        int score = 3;
        int stroke = 0;
        assertEquals(stroke, card1.currentStrokes());
        assertEquals(score, card1.score(1));
    }

    @Test
    /**
     * Test for score on hole 7
     */
    public void scoreTestSeven() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addHole();
        card1.addHole();
        card1.addHole();
        card1.addHole();
        card1.addHole();
        card1.addHole();
        card1.addHole();
        int hole = 7;
        int stroke = 0;
        assertEquals(stroke, card1.currentStrokes());
        assertEquals(stroke, card1.score(hole));
    }

    @Test
    /**
     * Test for score on hole 18
     */
    public void scoreTest18() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 0; i < 18; i++) {
            card1.addHole();
        }
        int hole = 18;
        int stroke = 0;
        int score = 0;
        assertEquals(stroke, card1.currentStrokes());
        assertEquals(score, card1.score(hole));
    }
    @Test
    /**
     * Test for 0 holes
     */
    public void numberOfHolesEmpty() {
        ScoreCard card1 = new ScoreCard1L();
        int tHoles = card1.numberOfHoles();
        int holes = 0;
        int strokes = card1.currentStrokes();
        int score = 0;
        assertEquals(score, strokes);
        assertEquals(holes, tHoles);
    }
    @Test
    /**
     * Test for 1 hole
     */
    public void numberOfHolesOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addHole();
        int tHoles = card1.numberOfHoles();
        int holes = 1;
        int strokes = card1.currentStrokes();
        int score = 0;
        assertEquals(score, strokes);
        assertEquals(holes, tHoles);
    }
    @Test
    /**
     * Test for 18 holes
     */
    public void numberOfHoles18() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 0; i < 18; i++) {
            card1.addHole();
        }
        int tHoles = card1.numberOfHoles();
        int holes = 18;
        int strokes = card1.currentStrokes();
        int score = 0;
        assertEquals(score, strokes);
        assertEquals(holes, tHoles);
    }
}
