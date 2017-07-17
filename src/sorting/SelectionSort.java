public class SelectionSort{

    public static void main(String args[]){
        int arrs[] = {10,9,8,7,6,5,4,3,2,1};
        selectionSort(arrs,10);
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i]);
        }
    }

    private static void selectionSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(int arr[], int currIndex, int minIndex){
        int temp = arr[minIndex];
        arr[minIndex] = arr[currIndex];
        arr[currIndex] = temp;
    }
}