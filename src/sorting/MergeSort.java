import java.util.Arrays;

/**
 * Created by OrangeKevin on 8/27/17.
 */
public class MergeSort {

    private MergeSort(){};

    public static void sort(Comparable arr[]){
        int n = arr.length;
        mergeSort(arr, 0, n-1);
    }

    private static void mergeSort(Comparable arr[], int l, int r){
        if(l >= r){
            return;
        } else {
            int mid = (l+r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(Comparable arr[], int l, int mid, int r){
        Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);
        int i = l;
        int j = mid + 1;
        for(int k = l; k<=r; k++){
            if(i > mid){ //左半部分处理完毕
                arr[k] = aux[j-l];
                j++;
            } else if(j > r){ //右半部分处理完毕
                arr[k] = aux[i-l];
                i++;
            } else if(aux[i-l].compareTo(aux[j-l]) < 0){ //左半部分元素比右半部分小
                arr[k] = aux[i-l];
                i++;
            } else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
}
