package section14Loops.forLoop;

public class ExerciseRunner {
    public static void main(String[] args) {

        MyNumber number = new MyNumber(9);
        number.isPrime();

        int sum = number.sumUpToN();
        System.out.println(sum);

        number.printANumberTriangle();
    }
}
