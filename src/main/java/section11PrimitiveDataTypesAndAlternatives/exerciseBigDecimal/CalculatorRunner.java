package section11PrimitiveDataTypesAndAlternatives.exerciseBigDecimal;

import section11PrimitiveDataTypesAndAlternatives.BigDecimalClass;

import java.math.BigDecimal;

public class CalculatorRunner {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");

        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
