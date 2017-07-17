public class SelectionSort{

    public static void main(String args[]){
        Integer arrs[] = {10,9,8,7,6,5,4,3,2,1};
        selectionSort(arrs,arrs.length);
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }

        System.out.println("");

        Double arrs2[] = {10.9,9.9,8.8,7.7,8.6};
        selectionSort(arrs2,arrs2.length);
        for(int i=0; i<arrs2.length; i++){
            System.out.print(arrs2[i] + " ");
        }

        System.out.println("");

        String arrs3[] = {"B","C","D","A"};
        selectionSort(arrs3,arrs3.length);
        for(int i=0; i<arrs3.length; i++){
            System.out.print(arrs3[i] + " ");
        }
    }

    private static void selectionSort(Comparable arr[], int n){
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