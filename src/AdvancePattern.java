public class AdvancePattern {
    public static void main(String[] args) {
        System.out.println("Palindrome Triangle");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=5-i ; j++ ) {
                System.out.print("  ");
            }
            for(int j=i; j>=1 ; j--){
                System.out.print(j+" ");
            }
            for ( int j = 2; j <=i ; j++ ){
                    System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.print("\n\n\n");
        System.out.println("Butterfly");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <5 ; j++ ) {
                if(j>i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for ( int j = 0; j<5 ; j++ ) {
                if(j>=5-i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <5 ; j++ ) {
                if (j<=5-i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for ( int j = 0; j <5 ; j++ ) {
                if (j>=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("\n\n\n");
        System.out.println("Rotated Rhombus");
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<5-i+1 ; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4 ; i>=1 ; i--){
            for(int j=0 ; j<=4-i ; j++){
                System.out.print("  ");
            }
            for(int j=0 ; j<2*i-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        System.out.println("Hollow Butterfly");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <5 ; j++ ) {
                if(j>i | (j>0 && j<i)) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for ( int j = 0; j<5 ; j++ ){
                if(j<5-i-1 | (i>1 && j>5-i-1 && j<4) ){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <5 ; j++ ) {
                if (j>5-i-1 | (i<3 && j>0 && j<5-i-1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            for ( int j = 0; j <5 ; j++ ) {
                if (j<i | (i<3 & j>i & j<4)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print("\n\n\n");
        System.out.println("Hollow Rhombus");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=5-i ; j++ ) {
                System.out.print("  ");
            }
            for(int j=1 ; j<=5 ; j++ ){
                if(i>1 && i<5 && j>1 && j<5){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print("\n\n\n");
        System.out.println("Pascal's Triangle");
        for(int i=0 ; i<5 ; i++) {
            for(int j=0 ; j<=5-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                int combination = factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(combination+" ");
            }
            System.out.println();
        }
    }

    public static int factorial(int a){
        if(a<=1) return 1;
        else return a*factorial(a-1);
    }
}
