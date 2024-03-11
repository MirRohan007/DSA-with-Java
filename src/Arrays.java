import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        printUserName();
        maximumAndMinimumNumber();
        isSortedAscending();
    }

    public static void printUserName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        String []names = new String[size];
        for (int i = 0; i < size ; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < size ; i++) {
            System.out.println(names[i]);
        }
    }

    public static void maximumAndMinimumNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int []numbers = new int[size];
        for (int i = 0; i < size ; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = 0 , min = numbers[0] ;
        for (int i = 0; i < size ; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }

    public static void isSortedAscending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int []numbers = new int[size];
        for (int i = 0; i < size ; i++) {
            numbers[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size-1 ; i++) {
            if(numbers[i] <= numbers[i+1]){
                count ++;
            }
            else {
                System.out.println("Array is not sorted in ascending order.");
                break;
            }
        }
        if(count == size-1){
            System.out.println("Array is sorted in ascending order.");
        }
    }
}
