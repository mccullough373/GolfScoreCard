package components.Golf.ScoreCard;
/**
 * Layered implementations of secondary methods for {@code ScoreCard}.
 *
 */
public abstract class ScoreCardSecondary implements ScoreCard {

    /**
     * Common Method.
     */
    @Override
    public String toString() {
        String scores = Integer.toString(this.currentStrokes());
        if (this.numberOfHoles() != 0) {
        int length = this.numberOfHoles();
        int first = this.score(1);
        scores = scores + " " + Integer.toString(first);
        for (int i = 1; i < length; i++) {
            int score = this.score(i);
            String value = Integer.toString(score);
            scores = scores + " " + value;
        }
    }
        return scores;
}
    /**
     * Common Method.
     */
    @Override
    public boolean equals(Object card) {
        if (card == this) {
            return true;
        }
        if (card == null) {
            return false;
        }
        if (!(card instanceof ScoreCard)) {
            return false;
        }

        ScoreCard s = (ScoreCard) card;
        if (this.numberOfHoles() != s.numberOfHoles()
        || this.currentStrokes() != s.currentStrokes()) {
        return false;
        }

        for (int i = 1; i <= this.numberOfHoles(); i++) {
            if (this.score(i) != s.score(i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Non-Kernel Method.
     */
    @Override
    public void outOfBounds() {
        this.addStroke();
        this.addStroke();
    }
    /**
     * Non-Kernel Method.
     */
    @Override
    public int totalScore() {
        int sum = 0;
        if (this.numberOfHoles() != 0) {
            for (int i = 1; i <= this.numberOfHoles(); i++) {
                sum += this.score(i);
            }
        }
        return sum;
    }
    /**
     * Non-Kernel Method.
     */
    @Override
    public int frontNine() {
        assert this.numberOfHoles() >= FRONT
        : "Violation of this.numberOfHoles() >= 9";
        int sum = 0;
        for (int i = 1; i <= FRONT; i++) {
            sum += this.score(i);
        }
        return sum;
    }
    /**
     * Non-Kernel Method.
     */
    @Override
    public int backNine() {
        assert this.numberOfHoles() >= BACK
        : "Violation of this.numberOfHoles() >= 18";
        int sum = 0;
        for (int i = FRONT; i < BACK; i++) {
            sum += this.score(i);
        }
        return sum;
    }

}
