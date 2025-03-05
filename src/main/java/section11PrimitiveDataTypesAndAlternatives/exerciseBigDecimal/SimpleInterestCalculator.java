package section11PrimitiveDataTypesAndAlternatives.exerciseBigDecimal;


import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private BigDecimal principal ;
    private BigDecimal interest; ;

    public  SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest =new BigDecimal(interest);
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        /**
         *
         * My response:
         *         BigDecimal num = new BigDecimal(principal);
         *         BigDecimal num1 = new BigDecimal(interest);
         */
        BigDecimal nYears = new BigDecimal(noOfYears);
        BigDecimal procent = new BigDecimal(100);

        BigDecimal sum = principal.multiply(nYears).multiply(interest).divide(procent);
        BigDecimal totalValue = principal.add(sum);
        return totalValue;
    }
}
