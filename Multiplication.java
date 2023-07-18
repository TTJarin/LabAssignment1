package problem_E13;

public class Multiplication {
    private int result;

    public Multiplication(){
        result=1;
    }
    public long multiplication(int number){
        for(int countloop=1;countloop<=number;countloop++){
            result = result*countloop;
        }
        return result;
    }
}
