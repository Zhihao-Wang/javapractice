package sort;

import static sort.InsertSort.insertSort;

public class Test {

    @org.junit.Test
    public  void test() {
        int[] arr = {1, 7, 3, 4, 2, 8, 5, 9, 6};
        insertSort(arr);
    }
}
