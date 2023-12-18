package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;

        for (int i = lengthOfLastNumber; i > 0; i--){
            int t = 1;

            for (int j = i;j>0; j--){
                t *=10;
            }

            t--;
            result += t;
        }

        System.out.println(result);
    }
}
