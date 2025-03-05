package section10JavaCodingExercises.exercise6;

public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        /**
         * TODO: Convert the total inches into feet and inches. One foot is 12 inches.
         *  Store the feet and inches in their respective instance variables.
         */
        if (inches < 0) {
            // Invalid input
            this.feet = -1;
            this.inches = -1;
        } else {
            // Convert inches to feet and remaining inches
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    public int getFeet() {
        // TODO: Return the value of feet.
        return this.feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return this.inches;
    }
}

