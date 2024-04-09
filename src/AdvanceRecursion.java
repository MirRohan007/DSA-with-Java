import java.util.ArrayList;
import java.util.Objects;

public class AdvanceRecursion {
    public static void printAllPermutationsOfAString(String str, String permutation){
        if(Objects.equals(str, "")){
            System.out.println(permutation);
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printAllPermutationsOfAString(newString, permutation + currentChar);
        }
    }

    public static int totalNoOfPathsInAMaze(int i, int j, int n, int m, String path){
        if(i == n || j == m){
            return 0;
        }
        if(i == n - 1 && j == m - 1){
            path += "("+i+" , "+j+")";
            System.out.println(path);
            return 1;
        }

        path += "("+i+" , "+j+"), ";
        int downPaths = totalNoOfPathsInAMaze(i + 1, j, n, m, path);
        int rightPaths = totalNoOfPathsInAMaze(i, j + 1, n, m, path);

        return downPaths + rightPaths;
    }

    public static int totalWaysToPutTilesOnFloor(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        int verticalWays = totalWaysToPutTilesOnFloor(n - m, m);
        int horizontalWays = totalWaysToPutTilesOnFloor(n - 1, m);

        return verticalWays + horizontalWays;
    }

    public static int totalWaysToInviteGuests(int n){
        if(n <= 1){
            return 1;
        }

        int singleInvite = totalWaysToInviteGuests(n - 1);
        int pairInvite = (n - 1) * totalWaysToInviteGuests(n - 2);

        return singleInvite + pairInvite;
    }

    public static void printTotalSubsetsOfNaturalNumbers(int from, int to, ArrayList<Integer> subset){
        if(from == to + 1){
            for (Integer integer : subset) {
                System.out.print(integer + " ");
            }
            System.out.println();
            return;
        }

        subset.add(from);
        printTotalSubsetsOfNaturalNumbers(from + 1, to, subset);

        subset.remove(subset.size() - 1);
        printTotalSubsetsOfNaturalNumbers(from + 1, to, subset);
    }
    public static void main(String[] args) {
        printAllPermutationsOfAString("abc","");
        System.out.println("Total number of paths available while moving in down or right direction in a matrix : "+totalNoOfPathsInAMaze(0, 0, 3, 3, ""));
        System.out.println("Total no of ways to put tile on floor : " + totalWaysToPutTilesOnFloor(4, 2));
        System.out.println("Total no ways to invite guests for the party : " + totalWaysToInviteGuests(5));
        ArrayList<Integer> subset = new ArrayList<>();
        printTotalSubsetsOfNaturalNumbers(1, 5, subset);
    }
}
