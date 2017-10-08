import java.util.Arrays;

/**
 * Created by OrangeKevin on 10/08/17.
 */
public class MergeSortBottomUp {

    private MergeSortBottomUp(){};

    public static void sort(Comparable arr[]){
        mergeSort(arr);
    }

    private static void mergeSort(Comparable arr[]){

        int n = arr.length;

        // Merge Sort Bottom Up 无优化版本
//        for (int size = 1; size < n; size *= 2)
//            for (int i = 0; i < n - size; i += size+size)
//                // 对 arr[i...i+size-1] 和 arr[i+size...i+2*size-1] 进行归并
//                merge(arr, i, i+size-1, Math.min(i+size+size-1,n-1));

        // Merge Sort Bottom Up 优化
        // 对于小数组, 使用插入排序优化

        for(int i = 0; i < n; i += 16)
            InsertionSort.sort(arr, i, Math.min(i+15, n-1));

        for(int size = 16; size < n; size += size)
            for(int i = 0; i < n - size; i += size+size)
                // 对于arr[mid] <= arr[mid+1]的情况,不进行merge
                if( arr[i+size-1].compareTo(arr[i+size]) > 0 )
                    MergeSort.merge(arr, i, i+size-1, Math.min(i+size+size-1,n-1));
    }

}
