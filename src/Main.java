public class Main {

    public static void main(String[] args) {
        int[] nuts = {3, 5435, 754, 2, 4, 7, 2345, 35, 7854, 654, 64, 6};
        insertionSort(nuts);
        for (int i = 0; i < nuts.length; i ++) {
            System.out.println(nuts[i]);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i ++) {
            int j = i;
            while (j - 1 > 0 && arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j --;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
