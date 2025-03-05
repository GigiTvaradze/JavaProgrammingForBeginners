package section12Conditionals;

public class IfElse {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}

/**
 *  Use if to specify a block of code to be executed, if a specified condition is true
 *
 *  Use else to specify a block of code to be executed, if the same condition is false
 *
 *  Use else if to specify a new condition to test, if the first condition is false
 */


/**
 * if (condition1) {
 *   // block of code to be executed if condition1 is true
 * } else if (condition2) {
 *   // block of code to be executed if the condition1 is false and condition2 is true
 * } else {
 *   // block of code to be executed if the condition1 is false and condition2 is false
 * }
 */