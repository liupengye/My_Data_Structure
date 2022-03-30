package Sort;
//选择排序为稳定算法，复杂度为O(n^2)
public class SelectionSort {

    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++){
                if(arr[j].compareTo(arr[min]) < 0){
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    private static <E> void swap (E[] arr, int i, int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int n = 10000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);

        SortingHelper.sortTest("SelectionSort", arr);
    }
}
