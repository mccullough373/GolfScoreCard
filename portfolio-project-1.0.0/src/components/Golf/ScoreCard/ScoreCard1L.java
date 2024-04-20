package components.Golf.ScoreCard;
import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * {@code ScoreCard} represented as a {@Sequence} with
 * implementations of primary methods.

 * @convention this.card has length greater than or equal to zero, and
 * this.stroke is greater than or equal to zero.
 *
 * @correspondence <pre>
 * this = [value of $this.card based on a sequence along with an integer
 * this.stroke]
 * </pre>
 */
public class ScoreCard1L extends ScoreCardSecondary {
    /**
    * Sequence of scores.
    */
    private Sequence<Integer> card;

    /**
     * Count of current hole strokes.
     */
    private Integer stroke;
    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.card = new Sequence1L<Integer>();
        this.stroke = 0;
    }
    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public ScoreCard1L() {
        this.createNewRep();
    }
    /*
     * Standard methods -------------------------------------------------------
     */
    @SuppressWarnings("unchecked")
    @Override
    public final ScoreCard newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }
    @Override
    public final void transferFrom(ScoreCard source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof ScoreCard1L : ""
                + "Violation of: source is of dynamic type Sequence1L<?>";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case: source must be of dynamic type Sequence1L<?>,
         * and the ? must be T or the call would not have compiled.
         */
        ScoreCard1L localSource = (ScoreCard1L) source;
        this.card = localSource.card;
        this.stroke = localSource.stroke;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final void addStroke() {
        this.stroke += 1;
    }
    @Override
    public final void addHole() {
        this.card.add(this.card.length(), this.stroke);
        this.stroke = 0;
    }
    @Override
    public final int score(int i) {
        return this.card.entry(i - 1);
    }
    @Override
    public final int currentStrokes() {
        return this.stroke;
    }
    @Override
    public final int numberOfHoles() {
        return this.card.length();
    }
}
