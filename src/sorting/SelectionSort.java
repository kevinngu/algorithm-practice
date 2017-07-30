import helper.SortTestHelper;

public class SelectionSort{

    public static void main(String args[]){
        int n = 100000;
        Integer[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        SortTestHelper.testSort("SelectionSort", arr);

    }

    public static void selectionSort(Comparable arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            //find min value in [i, n)
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(Object arr[], int currIndex, int minIndex){
        Object temp = arr[minIndex];
        arr[minIndex] = arr[currIndex];
        arr[currIndex] = temp;
    }
}