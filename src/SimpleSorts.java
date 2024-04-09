public class SimpleSorts {
    public static void main(String[] args) {
        int []a = {7,8,3,5,1};
        System.out.println("Bubble Sort :");
        bubbleSort(a);
        System.out.println();
        int []b = {7,8,3,5,1};
        System.out.println("Selection Sort :");
        selectionSort(b);
        System.out.println();
        int []c = {7,8,3,5,1};
        System.out.println("Insertion Sort :");
        insertionSort(c);
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        printArray(a);
        System.out.println();
        for(int i = 0 ; i<a.length-1 ; i++){
            for (int j = 0; j <a.length-i-1 ; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printArray(a);
    }

    public static void selectionSort(int[] a){
        printArray(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            int smallest = a[i];
            for (int j = i; j < a.length; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    int temp = a[i] ;
                    a[i] = smallest;
                    a[j] = temp;
                }
            }
        }
        printArray(a);
    }
    
    public static void insertionSort(int[] a){
        printArray(a);
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            for(int j= i-1; j >= 0; j--){
                if(a[j + 1] < a[j]){
                    int temp = a[j+1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        printArray(a);
    }
}
