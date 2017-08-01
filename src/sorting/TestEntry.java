import helper.SortTestHelper;

/**
 * Created by OrangeKevin on 8/1/17.
 */
public class TestEntry {


    public static void main(String args[]){
        int n = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        Integer[] copyArr = SortTestHelper.copyArr(arr);
        SortTestHelper.testSort("SelectionSort", arr);
        SortTestHelper.testSort("InsertionSort", copyArr);
    }
}
