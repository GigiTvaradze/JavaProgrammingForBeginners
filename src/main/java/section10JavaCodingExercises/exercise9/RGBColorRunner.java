package section10JavaCodingExercises.exercise9;

public class RGBColorRunner {
    public static void main(String[] args) {

        RGBColor color = new RGBColor(255, 0, 0);
        System.out.println(color.getRed());   // Prints: 255
        System.out.println(color.getGreen()); // Prints: 0
        System.out.println(color.getBlue());  // Prints: 0
        color.invert();
        System.out.println(color.getRed());   // Prints: 0
        System.out.println(color.getGreen()); // Prints: 255
        System.out.println(color.getBlue());  // Prints: 255


        RGBColor color1 = new RGBColor(0, 255, 0);
        color.invert();
        System.out.println(color.getGreen()); // Prints: 0


        RGBColor color2 = new RGBColor(128, 128, 128);
        color.invert();
        System.out.println(color.getRed());   // Prints: 127
        System.out.println(color.getGreen()); // Prints: 127
        System.out.println(color.getBlue());  // Prints: 127
    }
}