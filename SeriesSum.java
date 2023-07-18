package problem_E12;

public class SeriesSum {
    private int result;

    public SeriesSum(){
        result = 0;
    }
    public int seriesSum(int highestNum){
        for(int loopcount=1;loopcount<=highestNum;loopcount++){
            result=result+loopcount;

        }
        return result;
    }

}
