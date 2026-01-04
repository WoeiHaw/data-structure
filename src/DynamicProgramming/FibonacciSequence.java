package DynamicProgramming;

public class FibonacciSequence {
    static int counter = 0;
    static Long[] memo = new Long[100];
    public static long fib2(int n){
        counter++;
        if(memo[n] != null){
            return memo[n];
        }

        if(n==0|| n==1){
            return n;
        }

        memo[n] = fib2(n-1) + fib2(n-2);
        return memo[n];
    }

    public static long fib(int n){

        long[] fibList = new long[n+1];
        fibList[0] = 0;
        fibList[1] = 1;
        for(int index =2 ; index<=n; index++){
            counter++;
            fibList[index] = fibList[index-1] + fibList[index-2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter: " + counter);
    }
}
