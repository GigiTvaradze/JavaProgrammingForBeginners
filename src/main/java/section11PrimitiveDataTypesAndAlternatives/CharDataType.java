package section11PrimitiveDataTypesAndAlternatives;

/**
 * char Data Type in Java
 * The char data type in Java is used to store a single character.
 * It is a 16-bit unsigned integer (2 bytes) and follows the UTF-16 encoding standard.
 *
 * Key Characteristics:
 * Size: 2 bytes (16 bits)
 * Range: '\u0000' (0) to '\uffff' (65,535)
 * Default value: '\u0000' (null character)
 * Used for: Storing a single character (letters, digits, symbols, escape sequences)
 * Can store Unicode characters (supports international characters)
 */
public class CharDataType {
    public static void main(String[] args) {
        /**
         * Using Unicode Values
         * Java char supports Unicode escape sequences (\\uXXXX):
         */

        char unicodeChar = '\u03A9'; // Greek Omega (Ω)
        System.out.println(unicodeChar); // Output: Ω

    }
}

/**
 * Escape Sequences in char
 *
 * \n	New line
 * \t	Tab
 * \b	Backspace
 * \'	Single quote
 * \"	Double quote
 * \\	Backslash
 *
 */