package section9IntroductionToOOP.book;

public class BookRunner {
    public static void main(String[] args) {
        //book on algorithms
        Book artOfComputerPrograming = new Book(1000);
        //book on Java
        Book effectiveJava = new Book(1000);
        //How write great code
        Book cleanCode = new Book(10000);

        artOfComputerPrograming.setNoOfCopies(200);
        effectiveJava.setNoOfCopies(250);
        cleanCode.setNoOfCopies(220);
    }
}