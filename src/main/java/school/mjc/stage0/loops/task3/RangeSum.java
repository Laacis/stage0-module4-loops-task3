package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int tempResult = 0;

        for(int i = firstBoarder; i <= secondBoarder ;i++){
            tempResult += i;
        }

        System.out.println(tempResult);
    }
}
