package components.Golf.ScoreCard;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for {@code ScoerCard}'s Secondary methods.
 *
 * @author William Mccullough
 *
 */
public class ScoreCardTestSecondary {
    @Test
    /**
     * Test for toString on empty.
     */
    public void toStringEmpty() {
        ScoreCard card1 = new ScoreCard1L();
        String test = card1.toString();
        String ref = "0";
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for toString on one.
     */
    public void toStringOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addHole();
        card1.addStroke();
        String test = card1.toString();
        String ref = "1 1";
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for toString on many.
     */
    public void toStringManny() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        String test = card1.toString();
        String ref = "0 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3";
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for equals on empty.
     */
    public void equalsEmpty() {
        ScoreCard card1 = new ScoreCard1L();
        ScoreCard card2 = new ScoreCard1L();
        boolean ref = true;
        boolean test = card1.equals(card2);
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for equals on One hole.
     */
    public void equalsOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addHole();
        card1.addStroke();
        ScoreCard card2 = new ScoreCard1L();
        card2.addStroke();
        card2.addHole();
        card2.addStroke();
        boolean ref = true;
        boolean test = card1.equals(card2);
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for equals on empty.
     */
    public void equalsMany() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        ScoreCard card2 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card2.addStroke();
            card2.addStroke();
            card2.addStroke();
            card2.addHole();
        }
        boolean ref = true;
        boolean test = card1.equals(card2);
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for outOfBounds on empty.
     */
    public void outOfBoundsEmpty() {
        ScoreCard card1 = new ScoreCard1L();
        card1.outOfBounds();
        int ref = 2;
        int test = card1.currentStrokes();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for outOfBounds on one.
     */
    public void outOfBoundsOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.outOfBounds();
        int ref = 3;
        int test = card1.currentStrokes();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for outOfBounds on Many.
     */
    public void outOfBoundsMany() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.outOfBounds();
        card1.outOfBounds();
        card1.outOfBounds();
        int ref = 7;
        int test = card1.currentStrokes();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for totalScore on empty.
     */
    public void totalScoreEmpty() {
        ScoreCard card1 = new ScoreCard1L();
        int ref = 0;
        int test = card1.totalScore();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for totalScore on one hole.
     */
    public void totalScoreOne() {
        ScoreCard card1 = new ScoreCard1L();
        card1.addStroke();
        card1.addStroke();
        card1.addStroke();
        card1.addHole();
        int ref = 3;
        int test = card1.totalScore();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for totalScore on many holes.
     */
    public void totalScoreMany() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        int ref = 54;
        int test = card1.totalScore();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for totalScore on 9.
     */
    public void frontNine9() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 9; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        int ref = 27;
        int test = card1.totalScore();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for totalScore on 18.
     */
    public void frontNine18() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        int ref = 27;
        int test = card1.frontNine();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for backNine on 18.
     */
    public void backNine18() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        int ref = 27;
        int test = card1.backNine();
        assertEquals(ref, test);
    }
    @Test
    /**
     * Test for backNine on 18.
     */
    public void backNine18More() {
        ScoreCard card1 = new ScoreCard1L();
        for (int i = 1; i <= 18; i++) {
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addStroke();
            card1.addHole();
        }
        int ref = 45;
        int test = card1.backNine();
        assertEquals(ref, test);
    }
}
