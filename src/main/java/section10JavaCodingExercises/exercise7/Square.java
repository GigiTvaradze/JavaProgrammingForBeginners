package section10JavaCodingExercises.exercise7;

public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if (this.side <= 0){
            return -1;
        }  else {
            return this.side * this.side ;
        }
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if (this.side <= 0){
            return -1;
        }  else {
            return this.side * 4 ;
        }
    }
}