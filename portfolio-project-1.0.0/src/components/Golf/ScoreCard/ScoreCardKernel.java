package components.Golf.ScoreCard;

import components.standard.Standard;

/**
 * ScoreCard Kernel from standard.
 */
public interface ScoreCardKernel extends Standard<ScoreCard> {

    /**
     * Gets the holes for front nine.
     */
    int FRONT = 9;
    /**
     * Gets the holes for back nine.
     */
    int BACK = 18;

    /**
     * adds one stroke to this.strokes.
     *@updates this.strokes
     *@ensures this.strokes = #this.strokes + 1
     */
    void addStroke();

    /**
     * Stores this.strokes in the end of this.card.
     * @requires this.card.length < 18
     * @updates this.card
     * @clears this.strokes
     * @ensures this.card = #this.card * this.strokes
     */
    void addHole();

    /**
     * Returns the score of this.cards at entry i - 1.
     * @param i
     * The hole to get the score from.
     * @requires i > 0.
     * @return this.card.entry(i)
     * @ensures score = this.card.entry(i)
     */
    int score(int i);

    /**
     * Returns the amount of strokes on the current
     * hole.
     * @return this.strokes
     * @ensures currentStrokes = this.strokes
     */
    int currentStrokes();

    /**
     * The amount of holes played.
     * @return this.card.length()
     * @ensures length = this.card.length
     */
    int numberOfHoles();
}
