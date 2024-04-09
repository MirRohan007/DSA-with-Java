import java.util.Arrays;
import java.util.HashSet;

public class FamousRecursions {
    public static int first = -1;
    public static int last = -1;
    public static boolean[] map = new boolean[26];
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void towerOfHanoi(int n, String src, String helper, String destination){
        if(n == 1 ) {
            System.out.println("transfer disc " + n + " from " + src + " to " + destination);
            return;
        }
        towerOfHanoi(n-1 , src, destination, helper);
        System.out.println("transfer disc " + n + " from " + src + " to " + destination);
        towerOfHanoi(n-1, helper, src, destination);
    }

    public static void reverseString(String s, int length){
        if(length < 1){
            return;
        }
        System.out.print(s.charAt(length-1));
        reverseString(s, length - 1);
    }

    public static void firstAndLastOccurrence(String str, int index, char x){
        if(str.length() == index){
            if(last == -1){
                last = first;
            }
            System.out.println("First occurrence of '"+x+"' in '"+str+"' is at position "+first+".");
            System.out.println("Last occurrence of '"+x+"' in '"+str+"' is at position "+last+".");
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == x){
            if(first == -1){
                first = index + 1;
                firstAndLastOccurrence(str, index + 1, x);
            }
            else{
                last = index + 1;
                firstAndLastOccurrence(str, index + 1, x);
            }
        }
        else{
            firstAndLastOccurrence(str, index + 1, x);
        }
    }

    public static boolean isArraySortedStrictlyIncreasing(int[] a, int index){
        if(a.length == index + 1){
            return true;
        }
        if(a[index] < a[index + 1]){
            return  isArraySortedStrictlyIncreasing(a,index + 1);
        }
        else{
            return false;
        }
    }

    public static void moveAllCharToBackOfTheString(String str,int index, int count, String newString, char x){
        if(index == str.length()){
            newString = newString + String.valueOf(x).repeat(Math.max(0, count));
            System.out.println("Formatted string '"+str+"' is '"+newString+"'.");
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == x){
            count ++;
            moveAllCharToBackOfTheString(str, index + 1, count, newString, x);
        }
        else{
            newString += currentChar;
            moveAllCharToBackOfTheString(str, index + 1, count, newString, x);
        }
    }

    public static void removeDuplicatesFromString(String str, int index, String newString){
        if(index + 1 == str.length()){
            System.out.println("String '"+str+"' without duplicate values is '"+newString+"'.");
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar - 'a']){
            removeDuplicatesFromString(str, index + 1, newString);
        }
        else{
            map[currentChar - 'a'] = true;
            newString += currentChar;
            removeDuplicatesFromString(str, index + 1, newString);
        }
    }

    public static void printAllSubStringOfAString(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        printAllSubStringOfAString(str, index + 1, newString + currentChar);
        printAllSubStringOfAString(str, index + 1, newString);
    }

    public static void printAllUniqueSubStringOfAString(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currentChar = str.charAt(index);
        printAllUniqueSubStringOfAString(str, index + 1, newString + currentChar, set);
        printAllUniqueSubStringOfAString(str, index + 1, newString, set);
    }

    public static void printKeypadCombination(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapper = keypad[currentChar - '0'];

        for (int i = 0; i < mapper.length(); i++) {
            printKeypadCombination(str, index + 1, combination + mapper.charAt(i));
        }
    }
    public static void main(String []args) {
        towerOfHanoi(3, "s", "h", "d");
        reverseString("awesome", 7);
        System.out.println();
        firstAndLastOccurrence("Template", 0, 'e');
        int[] a = {2,3,4,5};
        System.out.println("Is the given array "+ Arrays.toString(a) +" strictly increasing? - "+isArraySortedStrictlyIncreasing(a,0));
        moveAllCharToBackOfTheString("conditionally", 0, 0, "", 'i');
        removeDuplicatesFromString("conditionally", 0, "");
        printAllSubStringOfAString("abc", 0, "");
        HashSet<String> set = new HashSet<>();
        printAllUniqueSubStringOfAString("aaa", 0, "", set);
        printKeypadCombination("2", 0, "");
    }
}