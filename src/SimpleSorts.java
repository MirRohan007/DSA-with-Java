public class SimpleSorts {
    public static void main(String[] args) {
        int []a = {7,8,3,5,1};
        bubbleSort(a);
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        for(int i = 0 ; i<a.length-1 ; i++){
            for (int j = 0; j <=a.length-i-1 ; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printArray(a);
    }
}
