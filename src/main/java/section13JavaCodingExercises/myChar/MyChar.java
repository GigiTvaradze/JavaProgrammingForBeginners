package section13JavaCodingExercises.myChar;

public class MyChar {
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {

        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u': return  true;
            default: return false;
        }
    }
}
