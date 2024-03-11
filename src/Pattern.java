public class Pattern {
    public static void main(String[] args) {
        int c1 = 0;
        for(int i=0 ; i<5 ; i++){
            for (int j=0 ; j<5 ; j++){
                System.out.print("😎 ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j < 5; j++ ) {
                if( i==0 | i==4 | j==0 | j==4 ) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <=i ; j++ ) {
                System.out.print("😎 ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 5; j >i ; j-- ) {
                System.out.print("😎 ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 4; j>=0 ; j-- ) {
                if(i>=j){
                    System.out.print("😎 ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=i ; j++ ) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 1; j <=5-i ; j++ ) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        System.out.println("Floyd's Triangle");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=i ; j++ ) {
                c1 ++;
                System.out.print(c1+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        System.out.println("0 1 Triangle");
        for( int i=0 ; i<5 ; i++ ) {
            for ( int j = 0; j <=i ; j++ ) {
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                     System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        System.out.println("Rhombus");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=5-i ; j++ ) {
                System.out.print("  ");
            }
            System.out.println("* * * * *");
        }
        System.out.print("\n\n\n");
        for( int i=1 ; i<=5 ; i++ ) {
            for ( int j = 1; j <=5-i ; j++ ) {
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
