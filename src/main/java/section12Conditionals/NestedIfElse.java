package section12Conditionals;

/**
 * Nested if in Java refers to having one if statement inside another if statement.
 * If the outer condition is true the inner conditions are checked and executed accordingly.
 *
 * Note:
 *
 * Normal if condition checks condition independently which means each condition works on its own.
 * Whereas nested if checks conditions that depend on each other, which means one condition is only checked if another condition is true.
 */
public class NestedIfElse {
    public class code{
        public static void main(String[] args) {

            int n=24;

            //if else condition to check whether the number is even or odd
            if (n % 2 == 0){

                //the number is even
                System.out.print("Even ");

                //nested if else condition to check if n is divisible by 6 or not
                if (n % 6 == 0) {
                    //the number is divisible by 6
                    System.out.println("and divisible by 6");
                } else {
                    //the number is not divisible by 6
                    System.out.println("and not divisible by 6");
                }
            }
            else {
                //the number is odd
                System.out.println("Odd ");

                //nested if else condition to check if n is divisible by 3 or not
                if(n % 3 == 0) {
                    //the number is divisible by 3
                    System.out.println("and divisible by 3");
                } else {
                    //the number is not divisible by 3
                    System.out.println("and not divisible by 3");
                }
            }
        }
    }

}