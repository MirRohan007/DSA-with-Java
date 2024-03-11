import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        int totalLength = cumulativeStringLength();
//        System.out.println("Total length of the cumulative string is: "+totalLength);
//        replaceE();
        makeUserNameFromEmail();
    }

    public static int cumulativeStringLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size ; i++) {
            names[i] = sc.next();
        }
        int length = 0;
        for (int i = 0; i < size ; i++) {
            length += names[i].length();
        }
        return length;
    }

    public static void replaceE(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        System.out.println(s.replace("e","i"));
    }

    public static void makeUserNameFromEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '@'){
                break;
            }
            else{
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
