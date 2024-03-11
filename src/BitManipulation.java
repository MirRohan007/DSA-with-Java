import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        isPowerOfTwo();
        toggleBitOfSpecifiedPosition();
        numberOfOnesInBinaryRepresentation();
        decimalToBinary();
        binaryToDecimal();
    }

    public static void isPowerOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 32; i++) {
            int bitmask = 1<<i;
            int newBitmask = ~bitmask;
            if((n & newBitmask) == 0){
                System.out.println("Given number is "+i+"th power of 2.");
                count++;
                break;
            }
        }
        if(count == 0 ){
            System.out.println("Given number is not of any power of 2.");
        }
    }

    public static void toggleBitOfSpecifiedPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position to toggle the bit at that position:");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int newNumber;
        if((n & bitmask) == bitmask){
            int newBitMask = ~(bitmask);
            newNumber = n & newBitMask;
        }
        else{
            newNumber = n | bitmask;
        }
        System.out.println(newNumber);
    }

    public static void numberOfOnesInBinaryRepresentation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        int i = n;
        while(i != 0){
            if(i%2 == 1){
                count++;
            }
            i = i/2;
        }
        System.out.println("No of 1's in the binary representation of "+n);
        System.out.println(count);
    }

    public static void decimalToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        StringBuilder b = new StringBuilder();
        while(n != 0){
            b.insert(0,n%2);
            n = n/2;
        }
        System.out.println("Binary representation of "+n+" is:");
        System.out.println(b);
    }

    public static void binaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in binary representation:");
        String n = sc.next();
        int sum = 0;
        int j = 0;
        for (int i = n.length()-1; i >=0; i--) {
            int bit = Character.getNumericValue(n.charAt(i));
            System.out.println(bit);
            sum += bit<<j;
            j++;
        }
        System.out.println("Decimal representation of "+n+" is:");
        System.out.println(sum);
    }
}
