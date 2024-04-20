package components.Golf.ScoreCard;
/**
 * ScoreCard with Seocndary methods.
 */
public interface ScoreCard extends ScoreCardKernel {

    /**
     * adds two strokes to this.strokes.
     *@updates this.strokes
     *@ensures this.strokes = #this.strokes + 2
     */
    void outOfBounds();

    /**
     * Adds up and returns all entries in this.card.
     * @return the total amount of strokes hit
     * @ensures for i = 0; i < this.card.length(); i++,
     * totalScore += this.card.entry(i) || 0 if this.card is empty
     */
    int totalScore();
    /**
     * Adds up and returns the first nine entries in this.card.
     * @requires this.scorecard.length() >= 9
     * @return the total amount of strokes hit the first nine holes
     * @ensures for i = 1; i =< 9; i++,
     * frontNine += this.card.entry(i)
     */
    int frontNine();
    /**
     * Adds up and returns the first nine entries in this.card.
     * @requires this.card.length() >= 18
     * @return the total amount of strokes hit the back nine holes
     * @ensures for i = 10; i =< 18; i++,
     * backNine += this.card.entry(i)
     */
    int backNine();


}
