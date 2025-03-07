package section12Conditionals.designMenu;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        //ask user to enter the number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please Enter Second Number: ");
        int number2 = scanner.nextInt();

        System.out.println("Choose Operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        int chosenOperation = scanner.nextInt();
        System.out.println("You choose: " + chosenOperation);

        performOperation(chosenOperation, number1, number2);
    }

    private static void performOperation(int chosenOperation, int number1, int number2) {
        if (chosenOperation == 1){
            Operation operation = new Operation(number1, number2);
            Integer result = operation.add();
            System.out.println("Result is: " + result);

        } else if (chosenOperation == 2) {
            Operation operation = new Operation(number1, number2);
            Integer result = operation.subtract();
            System.out.println("Result is: " + result);

        } else if (chosenOperation == 3) {
            Operation operation = new Operation(number1, number2);
            Integer result = operation.multiply();
            System.out.println("Result is: " + result);

        } else if (chosenOperation == 4) {
            Operation operation = new Operation(number1, number2);
            Integer result = operation.divide();
            System.out.println("Result is: " + result);

        } else {
            System.out.println("Wrong input !");
        }
    }
}
