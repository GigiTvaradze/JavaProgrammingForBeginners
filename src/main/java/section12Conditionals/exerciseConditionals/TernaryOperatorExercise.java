package section12Conditionals.exerciseConditionals;

import java.util.Scanner;

public class TernaryOperatorExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me number and i will tell you, Is number even or not: ");
        Integer givenNumber = scanner.nextInt();
        String isEven = (givenNumber % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + isEven);
    }
}
