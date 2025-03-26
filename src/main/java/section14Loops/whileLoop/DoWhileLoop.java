package section14Loops.whileLoop;

public class DoWhileLoop {
    /**
     * The do/while loop is a variant of the while loop.
     * This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
     */

    //do {
    // code block to be executed
    //}
    //while (condition);
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println("Let's GO");
            i++;
        } while (i<5);
    }
}

/**
 * The example below uses a do/while loop.
 * The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
 *
 *int i = 0;
 * do {
 *   System.out.println(i);
 *   i++;
 * }
 * while (i < 5);
 */