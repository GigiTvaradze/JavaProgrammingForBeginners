package section13JavaCodingExercises.myChar;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar();

        System.out.println(myChar.isVowel('A'));  // Output: true
        System.out.println(myChar.isVowel('b'));  // Output: false
        System.out.println(myChar.isVowel('E'));  // Output: true
        System.out.println(myChar.isVowel('f'));  // Output: false
    }
}
