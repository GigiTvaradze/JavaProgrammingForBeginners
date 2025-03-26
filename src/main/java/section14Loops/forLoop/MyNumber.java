package section14Loops.forLoop;

public class MyNumber {
   private int number;

    public MyNumber(int number){
        this.number = number;
    }

    public void isPrime() {
        for (int i = 1; i < 10; i++) {
            if (number % number == 0 || number / 1 == number || number % i == 0){
                System.out.println( "Is Not Prime" );
                break;
            } else {
                System.out.println("Is Prime");
            }
        }
    }

    public  int sumUpToN() {
        int sumOfDivisors = 0;
        for (int i = 0; i < number; i++) {
            sumOfDivisors = sumOfDivisors + i;
        }
        return sumOfDivisors;
    }

    public void printANumberTriangle(){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}