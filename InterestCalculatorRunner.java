package problem_E14;


public class InterestCalculatorRunner {
    public static void main(String[] args) {
        InterestCalculator interestCalculator = new InterestCalculator();
        System.out.println("After 1 year,calculated balance:" + interestCalculator.calculate(1,5,1000));
        System.out.println("After 2 year,calculated balance:" + interestCalculator.calculate(2,5,1000));
        System.out.println("After 3 year,calculated balance:" + interestCalculator.calculate(3,5,1000));
    }


}
