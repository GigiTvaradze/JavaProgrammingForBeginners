package section11PrimitiveDataTypesAndAlternatives.exerciseBiNumbers;

public class BiNumbersRunner {
    public static void main(String[] args) {
        BiNumbers  numbers = new BiNumbers(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doublee();
        System.out.println(numbers.getA());
        System.out.println(numbers.getB());
    }
}
