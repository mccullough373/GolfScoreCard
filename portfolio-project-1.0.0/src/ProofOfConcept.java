import components.sequence.Sequence1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
/**
 * Proof of concept.
 */
public class ProofOfConcept {

    /**
     * Counts the strokes in this.
     */
    private int strokes;

    /**
     * Stores the score card in this.
     */
    private Sequence1L<Integer> card;
/**
 * Creator of original representation.
 */
    private void createNewRep() {
        this.strokes = 0;
        this.card = new Sequence1L<Integer>();
    }
    /**
     * No argument constructor.
     */
    public ProofOfConcept() {
        this.createNewRep();
    }
/**
 * adds one storke to this.strokes.
 */
    private void addStroke() {
        this.strokes += 1;
    }
    /**
     * Stores this.strokes in the end of this.card.
     */
    private void addHole() {
        int length = this.card.length();
        this.card.add(length, this.strokes);
        this.strokes = 0;
    }
    /**
     * Returns the score of this.cards at entry i.
     * @param i
     * The hole to get the score from.
     * @requires i > 0.
     * @return this.card.entry(i)
     */
    private int score(int i) {
        return this.card.entry(i - 1);
    }
    /**
     * The amount of holes played.
     * @return this.card.length()
     */
    private int numberOfHoles() {
        return this.card.length();
    }

    /**
     * Main.
     * @param args
     */
public static void main(String[] args) {
    SimpleWriter out = new SimpleWriter1L();
    /*
     * This is going to simulate what this will do for
     *  three-hole par 3 course.
     */

    ProofOfConcept c = new ProofOfConcept();


    /*
     * First Hole will be a 3-stroke par
     */

     //Stroke One
     c.addStroke();
     //Stroke Two
     c.addStroke();
     //Stroke Three
     c.addStroke();

     //Adding score to card
     c.addHole();

     /*
      * Second Hole will be a two stroke birdie
      */

      //Stroke One
     c.addStroke();
     //Stroke Two
     c.addStroke();

     //Adding score to card
     c.addHole();
     /*
      * Third is a four stroke bogey
      */

    //Stroke One
     c.addStroke();
     //Stroke Two
     c.addStroke();
     //Stroke Three
     c.addStroke();
     //Stroke Four
     c.addStroke();

     //Adding score to card
     c.addHole();
     /*
      * Outputting all the data and methods
      */
      out.println(c.numberOfHoles());
      out.println(c.score(1));
      out.println(c.score(2));
out.close();
}

}
