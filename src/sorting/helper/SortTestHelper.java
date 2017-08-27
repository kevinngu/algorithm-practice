package helper;

import java.lang.reflect.Method;

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

    public static boolean isSorted(Comparable[] arr){
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i].compareTo(arr[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static void testSort(String sortClassName, Comparable[] arr){
        try{
            Class sortClass = Class.forName(sortClassName);
            Method sortMethod = sortClass.getMethod("sort", new Class[]{Comparable[].class});
            Object[] params = new Object[]{arr};
            long startTime = System.currentTimeMillis();
            sortMethod.invoke(null, params);
            long endTime = System.currentTimeMillis();
            if(isSorted(arr))
                System.out.println("it's sort");
            else
                System.out.println("isn't sort");
            System.out.println(sortClass.getSimpleName() + " : " + (endTime - startTime) + " ms");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static Integer[] copyArr(Integer[] arr){
        Integer[] copyArr = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

}
