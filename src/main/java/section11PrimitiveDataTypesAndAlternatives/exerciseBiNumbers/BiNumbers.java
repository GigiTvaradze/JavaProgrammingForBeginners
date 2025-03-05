package section11PrimitiveDataTypesAndAlternatives.exerciseBiNumbers;

public class BiNumbers {
    private int a;
    private int b;

    public BiNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        int sum = a + b;
        return sum;
    }

    public int multiply(){
        int sum = a * b;
        return sum;
    }

    public void doublee(){
        this.a *=2;
        this.b *=2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}