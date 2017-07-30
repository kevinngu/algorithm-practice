package helper;

/**
 * Created by OrangeKevin on 7/30/17.
 */
public class SortTestHelper {

    private SortTestHelper(){};

    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR){
        if(rangeL <= rangeR){
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++){
                arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
            }
            return arr;
        }
        return null;
    }

    public static void printArray(Object arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
