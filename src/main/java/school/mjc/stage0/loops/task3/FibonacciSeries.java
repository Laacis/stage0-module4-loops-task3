package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacciFirst = 0;
        int fibonacciSecond = 1;

        for(int i = 0; i< lastFibonacci; i++){
            System.out.println(fibonacciFirst);

            int nextSecond = fibonacciFirst + fibonacciSecond;
            fibonacciFirst = fibonacciSecond;
            fibonacciSecond = nextSecond;
        }
    }
}
