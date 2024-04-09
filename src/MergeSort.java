public class MergeSort {
    public static void conquer(int[] arr, int s, int mid, int e){
        int fai = s;
        int lai = mid + 1;

        int[] merged = new int[e - s + 1];
        int x = 0;

        while(fai <= mid && lai <=e){
            if(arr[fai] > arr[lai]){
                merged[x++] = arr[lai++];
            }
            else{
                merged[x++] = arr[fai++];
            }
        }

        while(fai <= mid){
            merged[x++] = arr[fai++];
        }

        while(lai <= e){
            merged[x++] = arr[lai++];
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int s, int e){
        if(s == e){
            return;
        }
        int mid = s + (e - s)/2;

        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);
    }
    public static void main(String[] args) {
        int[] array = {6,8,7,4,2,3};

        divide(array, 0, array.length - 1);

        for (int j : array) {
            System.out.println(j);
        }
    }
}
