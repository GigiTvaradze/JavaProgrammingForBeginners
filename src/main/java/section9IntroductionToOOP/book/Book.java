package section9IntroductionToOOP.book;

public class Book {
    private String name;
    private String type;
    private int noOfCopies;

    public Book(Integer noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    /**
     * @param howMuch
     */
    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    /**
     * @param howMuch
     */
    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}