package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greatestDivisor = 1;
        int biggestNumber = first > second? first: second;

        for(int i = 1; i <= biggestNumber; i++ ){
            if(first % i == second % i){
                greatestDivisor = i;
            }
        }

        System.out.println(greatestDivisor);
    }
}
