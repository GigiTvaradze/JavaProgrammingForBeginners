package section12Conditionals.designMenu;

public class Operation {
    private Integer number1;
    private Integer number2;
    public Operation(Integer number1, Integer number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer add(){return number1 + number2;}
    public Integer multiply(){
        return number1 * number2;
    }
    public Integer divide(){return number1/number2;}
    public Integer subtract(){return number1-number2;}
}
