public class InsertionSort {

    public static void sort(Comparable arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j>0; j--){
                if(arr[j].compareTo(arr[j-1]) < 0){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }

        }
    }

    private static void swap(Object arr[], int currIndex, int minIndex){
        Object temp = arr[minIndex];
        arr[minIndex] = arr[currIndex];
        arr[currIndex] = temp;
    }
}