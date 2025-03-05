package section11PrimitiveDataTypesAndAlternatives;

/**
 *  Boolean Data Type in Java
 * The boolean data type in Java is used to store true or false values.
 * It takes 1 bit of memory but is typically stored as a byte (8 bits) due to memory alignment.
 * Default value: false
 * Cannot be converted to other data types directly.
 *
 * &&	Logical AND
 * ||   Logical OR
 * !	Logical NOT
 * ^
 * Bitwise XOR (^) with Boolean Values
 * The ^ operator returns true if only one of the operands is true.
 * If both operands are true or both are false, the result is false.
 *
 * boolean a = true;
 * boolean b = false;
 *
 * System.out.println(a ^ b); // true (because one is true, the other is false)
 * System.out.println(a ^ a); // false (because both are true)
 * System.out.println(b ^ b); // false (both are false)
 *
 * ==	Equal to	5 == 5	true
 * !=	Not equal to	5 != 3	true
 * >	Greater than	10 > 5	true
 * <	Less than	3 < 5	true
 * >=	Greater than or equal	5 >= 5	true
 * <=	Less than or equal	3 <= 2	false
 */
public class BooleanDataTypes {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isTired = false;

    }
}
