public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low <= high){
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] array = {6,8,7,4,2,3};

        quickSort(array, 0, array.length - 1);

        for (int j : array) {
            System.out.println(j);
        }
    }
}
