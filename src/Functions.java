import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Average();
        sumOfOddNumbers();
        maximumOfTwoNumbers();
        circumferenceOfACircle();
        eligibleForVote();
        countDifferentNumbers();
        raisedPower();
        gcdOfTwoNumbers();
        fibonacciSeries();
    }

    public static void Average(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt() ;
        int c = sc.nextInt();
        System.out.println((a+b+c)/3.0);
    }

    public static void sumOfOddNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a ; i++) {
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void maximumOfTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a,b));
    }

    public static void circumferenceOfACircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float r = sc.nextFloat();
        double c = 2.0*22.0/7.0*r;
        System.out.println(c);
    }

    public static void eligibleForVote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:(Return true if eligible for vote)");
        int age = sc.nextInt();
        System.out.println(age>18);
    }

    public static void countDifferentNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int i =  0;
        int p = 0, n = 0, z = 0;
        int a = sc.nextInt();
        while(i<a){
            int number = sc.nextInt();
            if(number>0){
                p ++;
            }
            else if(number<0){
                n ++;
            }
            else{
                z ++;
            }
            i ++;
        }
        System.out.println("Positive count: "+p);
        System.out.println("Negative count: "+n);
        System.out.println("Zeroes count: "+z);
    }

    public static void raisedPower(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int mul = 1;
        for (int i = 0; i < n; i++) {
            mul = mul * x;
        }
        System.out.println(mul);
    }

    public static void gcdOfTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public static void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Series:\n"+first+" "+second+" ");
        for (int i = 0; i < n-2; i++) {
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}