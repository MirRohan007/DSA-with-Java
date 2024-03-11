public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorialOfANumber(5));
        fibonacciSeries(0, 1, 30);
        System.out.println();
        System.out.println(raisedPowerOfAnyNumber(2, 6));
        System.out.println(raisedPowerOfAnyNumberTwo(2,1));
    }

    public static int factorialOfANumber(int n){
        if(n == 1) return 1;
        else{
            return n * factorialOfANumber(n - 1);
        }
    }

    public static void fibonacciSeries(int first, int second, int n) {
        System.out.print(first + " ");
        System.out.print(second + " ");
        printFibonacciSeries(second,first + second,n-2);
    }

    public static void printFibonacciSeries(int first, int second, int n){
        if(n>0){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            printFibonacciSeries(first, second, n - 1);
        }
    }

    public static int raisedPowerOfAnyNumber(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x * raisedPowerOfAnyNumber(x, n-1);
        }
    }

    public static int raisedPowerOfAnyNumberTwo(int x, int n){
        if(n == 0) {
            return 1;
        }
        else if(n % 2 == 0){
            return raisedPowerOfAnyNumber(x, n/2) * raisedPowerOfAnyNumber(x, n/2);
        }
        else{
            return x * raisedPowerOfAnyNumber(x, n/2) * raisedPowerOfAnyNumber(x, n/2);
        }
    }
}
