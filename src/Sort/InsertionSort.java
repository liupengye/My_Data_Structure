package Sort;
//插入算法是稳定算法，复杂度为:O(n^2),有序数据提升至O(n)

public class InsertionSort {

    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){

        for (int i = 0; i < arr.length; i++) {

            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args) {

        int n = 3;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("InsertionSort", arr);
    }
}
