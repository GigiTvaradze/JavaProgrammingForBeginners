package section10JavaCodingExercises.exercise7;

public class SquareRunner {
    public static void main(String[] args) {
        /**
         * In the first example, we create a Square object with side equal to 5.
         * Therefore, the calculateArea() method returns 25 (5 * 5) and the calculatePerimeter() method returns 20 (4 * 5).
         */
        Square square = new Square(5);
        System.out.println(square.calculateArea()); // prints: 25
        System.out.println(square.calculatePerimeter()); // prints: 20

        /**
         * In the second example, we create a Square object with side equal to 0.
         * Therefore, both the calculateArea() and calculatePerimeter() methods return -1 as they represent invalid values.
         * This is because a square cannot have a side length of zero.
         */
        Square squareWithZeroSide = new Square(0);
        System.out.println(squareWithZeroSide.calculateArea()); // prints: -1
        System.out.println(squareWithZeroSide.calculatePerimeter()); // prints: -1

        /**
         * In the third example, we create a Square object with a non-positive side (-5).
         * Therefore, both the calculateArea() and calculatePerimeter() methods return -1 as they represent invalid values.
         * This is because a square cannot have a side length less than zero.
         */
        Square squareWithNonPositiveSide = new Square(-5);
        System.out.println(squareWithNonPositiveSide.calculateArea()); // prints: -1
        System.out.println(squareWithNonPositiveSide.calculatePerimeter()); // prints: -1
    }
}
