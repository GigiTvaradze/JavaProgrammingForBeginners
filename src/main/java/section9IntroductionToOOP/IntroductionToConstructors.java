package section9IntroductionToOOP;

public class IntroductionToConstructors {
    /**
     * @param https://www.youtube.com/watch?v=pgBk8HC7jbU&t=152s
     * A constructor in Java is a special method that is used to initialize objects.
     * The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
     *
     * // Create a Main class
     * public class Main {
     *   int x;  // Create a class attribute
     *
     *   // Create a class constructor for the Main class
     *   public Main() {
     *     x = 5;  // Set the initial value for the class attribute x
     *   }
     *
     *   public static void main(String[] args) {
     *     Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
     *     System.out.println(myObj.x); // Print the value of x
     *   }
     * }
     *
     * Note that the constructor name must match the class name, and it cannot have a return type (like void).
     *
     * Also note that the constructor is called when the object is created.
     * All classes have constructors by default:
     *   if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
     */
}