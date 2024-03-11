import java.util.Scanner;
public class Table {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print it's table:");
        int n = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            int mul = n * i;
            System.out.println(n+" * "+i+" = "+mul);
        }
    }
}
