package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String intString = t + "";
        int result = 0;

        for(int i = 0; i < intString.length(); i++){
            result += t % 10;
            t /= 10;
        }

        if(result < 0){
            result *= -1;
        }

        System.out.println(result);
    }
}
