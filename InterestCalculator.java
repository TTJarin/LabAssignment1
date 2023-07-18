package problem_E14;

public class InterestCalculator {
    private double total;

    public InterestCalculator(){
        total=1;
    }

    public double calculate(int year, int rate, int capital) {
        double total = capital*Math.pow(1+((double)rate/100.0),year);
        return total;
    }

}
