package section10JavaCodingExercises.exercise6;

public class DimensionRunner {
    public static void main(String[] args) {
        Dimension dim1 = new Dimension(25);
        System.out.println(dim1.getFeet());    // Output: 2
        System.out.println(dim1.getInches());  // Output: 1

        Dimension dim2 = new Dimension(-1);
        System.out.println(dim2.getFeet());    // Output: -1
        System.out.println(dim2.getInches());  // Output: -1
    }
}
