public class InsertionSort {

    //performance turning
    public static void sort(Comparable arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            Comparable obj = arr[i];
            int j = i;
            for( ; j > 0 && arr[j-1].compareTo(obj) > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = obj;
        }
    }

    // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){
        for(int i = l + 1; i <= r; i ++){
            Comparable obj = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(obj) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = obj;
        }
    }

//    public static void sort(Comparable arr[]){
//        int n = arr.length;
//        for(int i = 1; i < n; i++){
//            for(int j = i; j>0; j--){
//                if(arr[j].compareTo(arr[j-1]) < 0){
//                    swap(arr,j,j-1);
//                } else {
//                    break;
//                }
//            }
//
//        }
//    }

    private static void swap(Object arr[], int currIndex, int minIndex){
        Object temp = arr[minIndex];
        arr[minIndex] = arr[currIndex];
        arr[currIndex] = temp;
    }
}